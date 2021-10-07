package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FactorialController {
	
	@GetMapping("showfact")
	String displayFactorialJsp(){
		return "fact";
		
	}
	@PostMapping("calfact")
	String FactorialJsp(@RequestParam String no,Model model){
		
		int f=1;
		for(int i=1;i<=Integer.parseInt(no);i++){
			f=f*i;
			
		}
		
		model.addAttribute("result",f);
		
		
		return "fact";
	}

}
