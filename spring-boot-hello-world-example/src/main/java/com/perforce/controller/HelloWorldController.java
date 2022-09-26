package com.perforce.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/hw")
public class HelloWorldController {
	
	@RequestMapping("/health")
	public String getHealth() {
		return "Service is Running...";
	}
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}
}