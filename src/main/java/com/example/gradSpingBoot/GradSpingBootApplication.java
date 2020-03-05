package com.example.gradSpingBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GradSpingBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(GradSpingBootApplication.class, args);
		Alien a = ctx.getBean(Alien.class);
		a.show();
	}

}
