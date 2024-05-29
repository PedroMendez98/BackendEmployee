package com.siiPracticalExercise.siiPracticalExercise.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.siiPracticalExercise.siiPracticalExercise.model.Employee;
import com.siiPracticalExercise.siiPracticalExercise.model.EmployeeResponse;
import com.siiPracticalExercise.siiPracticalExercise.model.SingleEmployeeResponse;

@Service
public class EmployeeService {
	private final String host = "http://dummy.restapiexample.com/api/v1/";
	
    private RestTemplate restTemplate = new RestTemplate();
		
	public EmployeeService(RestTemplate restTemplate2) {
		this.restTemplate = restTemplate2;
	}

	public List<Employee> getAllEmployees(){
		try {
			EmployeeResponse response = restTemplate.getForObject(host + "employees", EmployeeResponse.class);
	        System.out.println("succes");
			return response.getData();
		} catch (Exception e) {
            System.out.println("Error fetching employee: " + e.getMessage());
            return null;
        }
	}
	
	public Employee getEmployeeById(int id) {
		try {
            SingleEmployeeResponse response = restTemplate.getForObject(host + "employee/" + id, SingleEmployeeResponse.class);
            System.out.println("succes");
            System.out.println(response.getData());
            return response.getData();
        } catch (Exception e) {
            System.out.println("Error fetching employee with ID " + id + ": " + e.getMessage());
            return null;
        }
    }
}
