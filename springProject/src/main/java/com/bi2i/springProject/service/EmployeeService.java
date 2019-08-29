package com.bi2i.springProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi2i.springProject.Dao.EmployeeDao;
import com.bi2i.springProject.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeDetails(){
		return employeeDao.getEmployeeDetails();
	}
	
	public List<Employee> getSortedEmployeeDetails(String sortBy){
		return employeeDao.getSortedEmployeeDetails(sortBy);
	}
	
	
}
