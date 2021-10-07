package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.FactorialService;

@Controller
public class FactorialController {
	
	 @Autowired
	 FactorialService  factorialService;
	
	
	@GetMapping("showfact")
	String displayFactorialJsp(){
		return "fact";
		
	}
	@PostMapping("calfact")
	String FactorialJsp(@RequestParam String no,Model model){
		
		int f=factorialService.calFact(Integer.parseInt(no));
		
		
		
		model.addAttribute("result",f);
		
		
		return "fact";
	}
	@GetMapping("add")
	String sum(){
		return "add";
		
	}
	@PostMapping("sum")
	String result(@RequestParam String num1, String num2,Model model){
		
		int sum = factorialService.addition(Integer.parseInt(num1), Integer.parseInt(num2));
		
		System.out.println(sum);
		
		model.addAttribute("result",sum);
		
		
		return "add";
	}
	
	
	
	/*@PostMapping("calfact")
	String FactorialJsp(@RequestParam String no,Model model){
		
		int f=1;
		for(int i=1;i<=Integer.parseInt(no);i++){
			f=f*i;
			
		}
		
		model.addAttribute("result",f);
		
		
		return "fact";
	}*/
	
	@GetMapping("createst")
	String FactorialJsp(){
		
		factorialService.createStudent();
		
		return "fact";
		
		
	}
	
	
	
	
	

}
