package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;
import com.mph.entity.Manager;
import com.mph.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
//	private Manager manager;
//	private Employee employee;
	private LoginCredentials loginCredentials;
	
	
	@RequestMapping(value = "/loginpage",method = RequestMethod.GET)
	public ModelAndView signin()
	{
		return new ModelAndView("login");
		
	}
	
	
	
	
	
	public ModelAndView allDetails()
	{
		List<Employee> eList = employeeService.getAllEmployee();
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("elist", eList);	
		
	}
	
}
