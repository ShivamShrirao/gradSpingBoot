package com.example.gradSpingBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(HttpServletRequest req, HttpServletResponse res){
        HttpSession session = req.getSession();
        int i = Integer.parseInt(req.getParameter("t1"));
        int j = Integer.parseInt(req.getParameter("t2"));
        int k = i+j;
        session.setAttribute("k",k);
        return "index";
    }
}
