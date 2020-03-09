//package com.example.demo.controller;
//
//import com.example.demo.dao.AlienRepo;
//import com.example.demo.model.Alien;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class AlienController {
//    @Autowired
//    AlienRepo repo;
//
//    @RequestMapping("/")
//    public String home(){
//        return "home.jsp";
//    }
//
//    @DeleteMapping("/alien/{aid}")
//    public String deleteAlien(@PathVariable("aid") int aid){
//        Alien alien = repo.getOne(aid);
//        repo.delete(alien);
//        return "deleted";
//    }
//
//    @PostMapping(value = "/alien",consumes = {"application/json"})
//    public Alien addAlien(@RequestBody Alien alien){
//        repo.save(alien);
//        return alien;
//    }
//
//    @PutMapping(value = "/alien",consumes = {"application/json"})
//    public Alien updateAlien(@RequestBody Alien alien){
//        repo.save(alien);
//        return alien;
//    }
//
//    @RequestMapping(path="/aliens")
//    @ResponseBody
//    public List<Alien> getAliens(){
//        return repo.findAll();
//    }
//
//    @RequestMapping("/alien/{aid}")
//    @ResponseBody
//    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
//        return repo.findById(aid);
//    }
//}
