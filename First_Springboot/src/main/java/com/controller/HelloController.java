package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("hellodear")//localhost:444/hellodear
	String displayHelloJsp(){
		
		
		return "hello";
	}

}
