package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeEntity;
import com.dto.EmployeeDto;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("register")
	String showRegistrationPage() {

		return "register";
	}

	@PostMapping("register")
	String registerEmployee(@ModelAttribute EmployeeDto employeedto, Model model) {

		System.out.println(employeedto);

		employeeService.registerEmployee(employeedto);
		model.addAttribute("msg", "registration done");

		return "register";
	}

	@GetMapping("login") // localhost:444/login

	String displayLoginPage() {

		return "login";// go to login.jsp

	}

	@PostMapping("validate")
	String validateEmployee(@RequestParam String email, @RequestParam String pswd, Model model) {
//authenticate

		EmployeeDto employeeDto = employeeService.authenticateEmp(email, pswd);
		if (employeeDto != null) {
			model.addAttribute("msg", "Welcome "+employeeDto.getEmployeeName());
			return "login";
		} else {
			model.addAttribute("msg", "Login failed. Try again!!!");
			return "login";
		}

	}

	@GetMapping("showEmployees")
	String show(Model model) {
		List<EmployeeEntity> empList = employeeService.showall();
		//System.out.println(empList);
		model.addAttribute("empList", empList);

		return "showEmp";
	}
	//@PostMapping("updateEmp")
	

}
