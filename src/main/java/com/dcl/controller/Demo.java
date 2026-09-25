package com.dcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {

	@GetMapping("/path")
	public String demoController() {
		return "Test message for Docker";
	}
}
