package com.gabrielluan.projects.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Controller;

import com.gabrielluan.projects.demo.services.HelloWorldService;

// @Controller
public class GreetingController {
	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServiceFrenchImpl;
	
	private HelloWorldService helloWorldServiceGermanImpl;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@Autowired
	@Qualifier("french")
	public void setHelloWorldServiceFrenchImpl(HelloWorldService helloWorldService) {
		this.helloWorldServiceFrenchImpl = helloWorldService;
	}
	
	@Autowired
	@Qualifier("helloWorldServiceGermanImpl")
	public void setHelloWorldServiceGermanImpl (HelloWorldService helloWorldService) {
		this.helloWorldServiceGermanImpl = helloWorldService;
	}
	
	public String sayHello() {
		String greeting =  helloWorldService.getGreeting();
		
		System.out.println(greeting);
		System.out.println(this.helloWorldServiceGermanImpl.getGreeting());
		System.out.println(this.helloWorldServiceFrenchImpl.getGreeting());
		
		return greeting;
	}
}
