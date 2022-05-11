package com.mefa.employee.controller;

import com.mefa.employee.model.Employee;
import com.mefa.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeService;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.findAllEmployees();
	}

}
