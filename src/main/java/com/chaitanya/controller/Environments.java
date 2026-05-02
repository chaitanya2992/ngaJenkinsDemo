package com.chaitanya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Environments {
	@RequestMapping("/test")
	public String test(){
		return "test Environment";
	}
	@RequestMapping("/dev")
	public String dev(){
		return "Dev Environment";
	}
	@RequestMapping("/preprod")
	public String pprod(){
		return "Pre Prod Environment";
	}
	@RequestMapping("/prod")
	public String prod(){
		return "Prod Environment";
	}

}
