package com.siiPracticalExercise.siiPracticalExercise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	@JsonProperty("data") 
    private Employee[] employees;
	private int id;
    private String employee_name;
    private double employee_salary;
    private int employee_age;
    private String profile_image;
    private double employee_anual_salary; 
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
		calculateAnnualSalary();
	}
	public int getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	public double getEmployee_anual_salary() {
		return employee_anual_salary;
	}
	public void setEmployee_anual_salary(double employee_anual_salary) {
		this.employee_anual_salary = employee_anual_salary;
	}
	
	private void calculateAnnualSalary() {
        this.employee_anual_salary = this.employee_salary * 12;
    }
}
