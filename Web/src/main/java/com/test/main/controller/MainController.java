package com.test.main.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

	@GetMapping("/index")
	public String index(){
		
		System.out.println("index() MainController");
		
		return "index";
	}
}
