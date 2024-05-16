package com.example.textixadmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class textapi {
    @GetMapping("/")
	public String getCartProducts(){
		System.out.println("hy");
		return "App is running like a wow";
	}
}
