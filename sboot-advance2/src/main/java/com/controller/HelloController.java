package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	   @GetMapping("/")
		
		String displayDefaultPage(){
			return "defaultPage";
			
		}
		
		
	
	
	
	
	@GetMapping("hellodear")//localhost:444/hellodear
	String displayHelloJsp(){
		
		
		return "hello";
		
	}	
	
	
	@GetMapping("login")//localhost:444/login
	
   String displayLoginPage(){
		
		
		return "login";//go to login.jsp
		
	}
	
	
	@PostMapping("/validate")
	String validateUser(@RequestParam String email,  @RequestParam String pswd){
		System.out.println(email +"==============="+pswd);
		
		return "hello";
	}
	

}
