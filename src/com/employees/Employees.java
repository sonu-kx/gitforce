package com.employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees {
	
	public static void main(String[] args) {
		
		List<Empls> employeeList=new ArrayList<>();
		
		employeeList.add(new Empls(101, "Sonu", "Lucknow", 21, 10000));
		employeeList.add(new Empls(102, "Sameer", "Ayodhya", 25, 12000));
		employeeList.add(new Empls(103, "Ayush", "Ludhiana", 26, 15000));
		employeeList.add(new Empls(104, "Ravi", "Chandigarh", 28, 20000));
		employeeList.add(new Empls(105, "Nikhil", "Banaras", 21, 25000));
		employeeList.add(new Empls(106, "Anil", "Amritsar", 21, 50000));
		employeeList.add(new Empls(107, "Kamlesh", "Lahore", 28, 45000));
		employeeList.add(new Empls(108, "Sagar", "Ambala", 25, 55000));
		employeeList.add(new Empls(109, "Riya", "Ambala", 26, 19000));
		employeeList.add(new Empls(110, "Radha", "Ambala", 28, 22000));
	
		//group the list of objects based on departmentId,then apply into sorting based Name ascending Order.
		System.out.println("\n\ngroup the list of objects based on departmentId,then apply into sorting based Name ascending Order");
		Map<Integer, List<Empls>> list= employeeList.stream().sorted(Comparator.comparing(Empls::getName))
				.collect(Collectors.groupingBy(Empls::getDepartmentId, 
			Collectors.toList()));
		
		//System.out.println(list);
		
		for(Map.Entry<Integer, List<Empls>> l : list.entrySet()) {
			System.out.println(l);
		}
		
	
		
		
		
		
		
		//no. of unique department
		System.out.println("\n\n\nUnique no. of department id");
		 Long long1=null;
		long1 = employeeList.stream().map(Empls::getDepartmentId).distinct().collect(Collectors.counting());
			
		System.out.println(long1);
		
		//highest salary
		
		System.out.println("\n\n\nHighest paid salary of employees");
		List<Empls> list2= employeeList.stream().sorted(Comparator.comparingInt(Empls::getSalary).reversed())
				.collect(Collectors.toList());
		
		

		
		int count=0;
		for(Empls e: list2) {
			System.out.println(e.getName()+"  = "+e.getSalary());
			count++;
			if(count==5) {
				break;
			}
		}
		
		
	}
		
		
}
