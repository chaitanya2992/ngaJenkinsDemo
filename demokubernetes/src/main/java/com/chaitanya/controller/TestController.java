package com.chaitanya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hello")
	public String hello(){
		return "Sample spring-boot file for K8's.";
	}
	@RequestMapping("/welcome")
	public String welcome(){
		return "WELCOME to Sample spring-boot file for K8's.";
	}
	@RequestMapping("/exit")
	public String exit(){
		return "Exiting!! from Application";
	}
	@RequestMapping("/daemon")
	public String daemon(){
		return "Daemon application runs till physical/manual stoppage";
	}

}
