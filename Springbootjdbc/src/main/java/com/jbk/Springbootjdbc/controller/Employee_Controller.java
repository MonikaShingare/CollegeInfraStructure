package com.jbk.Springbootjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Springbootjdbc.entity.Employee;
import com.jbk.Springbootjdbc.service.Employee_Impl;
import com.jbk.Springbootjdbc.service.Employee_i;

@RestController
@RequestMapping("/employee")

public class Employee_Controller {
	Employee_i service=new Employee_Impl();

	
	
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		System.out.println("hello world");
		System.out.println("heyy you");
		String msg=service.saveEmployee(employee);
		
			return msg;
		
	}

}
