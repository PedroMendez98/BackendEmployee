package com.siiPracticalExercise.siiPracticalExercise;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import com.siiPracticalExercise.siiPracticalExercise.model.Employee;
import com.siiPracticalExercise.siiPracticalExercise.service.EmployeeService;

@SpringBootTest
class SiiPracticalExerciseApplicationTests {

		@InjectMocks
	 	private EmployeeService employeeClient;
		@MockBean
		private RestTemplate restTemplate;

    
	    @Test
	    public void testNullGetEmployeeById() {
	        int employeeId = 1;

	        Employee mockEmployee = new Employee();
	        mockEmployee.setId(employeeId);
	        mockEmployee.setEmployee_name("Tiger Nixon");
	        mockEmployee.setEmployee_salary(320800);
	        mockEmployee.setEmployee_age(61);

	        when(restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/1", Employee.class))
	            .thenReturn(mockEmployee);

	        Employee actualEmployee = employeeClient.getEmployeeById(employeeId);

	        assertNull(actualEmployee);
	    }

	}