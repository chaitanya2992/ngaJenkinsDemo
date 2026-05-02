package com.chaitanya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teams {
	@RequestMapping("/testt")
	public String testt(){
		return "Testing Team";
	}
	@RequestMapping("/devt")
	public String devt(){
		return "Development Team";
	}
	@RequestMapping("/opst")
	public String opst(){
		return "Operations Team";
	}
	@RequestMapping("/prodt")
	public String prodt(){
		return "Production Team";
	}
}
