package com.employee.pro.services;

import java.util.List;

import com.employee.pro.entity.Employees;

public interface EmployeeService {
	
	public List<Employees> getEmployees();
	
	public Employees getEmployee(long empId);
	
	public Employees addEmployees(Employees employees); 

}
