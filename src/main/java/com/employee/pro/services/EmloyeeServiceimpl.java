package com.employee.pro.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.pro.entity.Employees;
@Service
public class EmloyeeServiceimpl implements EmployeeService {
	List<Employees> list;
	
	public EmloyeeServiceimpl() {
		list= new ArrayList<>();
		list.add(new Employees(101, "Sonu", "Lucknow", 21, 10000));
		list.add(new Employees(102, "Sameer", "Ayodhya", 25, 12000));
		list.add(new Employees(103, "Ayush", "Ludhiana", 26, 15000));
		list.add(new Employees(104, "Ravi", "Chandigarh", 28, 20000));
		list.add(new Employees(105, "Nikhil", "Banaras", 21, 25000));
		list.add(new Employees(106, "Anil", "Amritsar", 21, 50000));
		list.add(new Employees(107, "Kamlesh", "Lahore", 28, 45000));
		list.add(new Employees(108, "Sagar", "Ambala", 25, 55000));
	}

	@Override
	public List<Employees> getEmployees() {
		
		return list;
	}

	@Override
	public Employees getEmployee(long empId) {
		// TODO Auto-generated method stub
		
		Employees e = null;
		for(Employees employees:list) {
			if(employees.getEmpId()==empId) {
				e=employees;
				break;
			}
		}
		return e;
	}

	

	@Override
	public Employees addEmployees(Employees employees) {
		// TODO Auto-generated method stub

		list.add(employees);
		return employees;
	}

	

	
	
	

}
