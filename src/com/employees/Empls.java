package com.employees;

public class Empls {
	
	Integer empId;
	String name;
	String address;
	Integer departmentId;
	Integer salary;
	public Empls(Integer empId, String name, String address, Integer departmentId, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.departmentId = departmentId;
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empls [empId=" + empId + ", name=" + name + ", address=" + address + ", departmentId=" + departmentId
				+ ", salary=" + salary + "]";
	}
	
	
	

}
