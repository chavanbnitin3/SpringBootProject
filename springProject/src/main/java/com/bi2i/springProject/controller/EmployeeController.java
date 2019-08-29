package com.bi2i.springProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bi2i.springProject.entity.Employee;
import com.bi2i.springProject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping( path = "/getEmployeeDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllUsers() {
		return employeeService.getEmployeeDetails();
	}
	
	@GetMapping( path = "/sortedEmployeeDetails/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> sortByName(@PathVariable(value = "name") String sortBy) {
		return employeeService.getSortedEmployeeDetails(sortBy);
	}

}
