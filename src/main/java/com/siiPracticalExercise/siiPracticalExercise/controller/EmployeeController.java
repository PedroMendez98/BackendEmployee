package com.siiPracticalExercise.siiPracticalExercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.siiPracticalExercise.siiPracticalExercise.model.Employee;

import com.siiPracticalExercise.siiPracticalExercise.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	 @GetMapping("/employee")
	 public Employee getEmployeeById(@RequestParam int id) {
	     return employeeService.getEmployeeById(id);
	 }
}
