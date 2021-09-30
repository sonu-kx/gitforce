package com.employee.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.pro.entity.Employees;
import com.employee.pro.services.EmployeeService;


@RestController
public class MyController {
	@Autowired
	private EmployeeService employeeService;
	
	public String emp() {
		return "Jai Ho";
	}
	
	@GetMapping("/emps")
	public List<Employees> getEmployees() {
		
		return this.employeeService.getEmployees();
		
	}
	@GetMapping("/emps/{empId}")
	public Employees getEmployee(@PathVariable String empId) {
		return this.employeeService.getEmployee(Long.parseLong(empId));
	}
	
	@PostMapping("/emps")
	public Employees addEmployee(@RequestBody Employees employees) {
		
		return this.employeeService.addEmployees(employees);
	}
	
	

}
