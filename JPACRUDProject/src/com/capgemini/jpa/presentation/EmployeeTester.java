package com.capgemini.jpa.presentation;

import java.util.Iterator;
import java.util.List;

import com.capgemini.jpa.exception.EmployeeException;
import com.capgemini.jpa.service.CustomerServiceImpl;
import com.capgemini.jpa.service.ICustomerService;

public class EmployeeTester {
	private static ICustomerService employeeService=
								new CustomerServiceImpl();
	
	public static void main(String[] args) {
		/*Employee employee=
		    new Employee(null,"preethi",new GregorianCalendar(1997,04,28),"manager",65750000.0,10);
		
		//addNewEmployee(employee);
		try {
			List<Employee> employeeList=employeeService.getAllEmployees();
			showEmployees(employeeList);
			employeeService.deleteEmployee(2);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	

	private static void addNewEmployee(Employee employee) {
		try {
			employeeService.addNewEmployee(employee);
		} catch (EmployeeException e) {			
			e.printStackTrace();
		}
		
		private static void showEmployees(List<Employee> employeeList) {
			// TODO Auto-generated method stub
			Iterator<Employee> iterator=employeeList.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
			
		}
		
	}

}*/
		/*Employee employee=
	    new Employee(null,"Clarke",new GregorianCalendar(2018,9,19),"Developer",45750.0,10);
	addNewEmployee(employee);*/
	try {
		/*Employee e1=employeeService.getEmployeeDetails(1);
		System.out.println(e1.getHiredate());
		e1.setJob("Analyst");
		employeeService.updateEmployee(e1);
		System.out.println(e1);
		employeeService.deleteEmployee(2);
		employeeService.getAllEmployees();*/
		List<Employee> employeeList=employeeService.getAllEmployees();
		showEmployees(employeeList);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
private static void showEmployees(List<Employee> employeeList) {
	// TODO Auto-generated method stub
	Iterator<Employee> iterator=employeeList.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
}
private static void addNewEmployee(Employee employee) {
	try {
		employeeService.addNewEmployee(employee);
	} catch (EmployeeException e) {			
		e.printStackTrace();
	}
	
}
}