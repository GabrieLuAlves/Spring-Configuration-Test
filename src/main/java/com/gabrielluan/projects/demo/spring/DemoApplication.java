package com.gabrielluan.projects.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.gabrielluan.projects.demo.controllers.GreetingController;

@SpringBootApplication
// @ComponentScan("com.gabrielluan.projects.demo")
@ImportResource("classpath:/spring/spring-config.xml")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		
		greetingController.sayHello();
	}

}
