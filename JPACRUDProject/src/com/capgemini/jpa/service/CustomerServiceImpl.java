package com.capgemini.jpa.service;

import java.util.List;

import com.capgemini.jpa.dao.CustomerDaoImpl;
import com.capgemini.jpa.dao.ICustomerDAO;
import com.capgemini.jpa.entity.Customer;

import com.capgemini.jpa.exception.EmployeeException;

public class CustomerServiceImpl implements ICustomerService {
	static ICustomerDAO customerDAO=new CustomerDaoImpl();
	
	/*@Override
	public void addNewEmployee(Employee employee) throws EmployeeException {
		employeeDAO.addNewEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(empid);
		
	}

	@Override
	public void updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(employee);
		
	}

	@Override
	public Employee getEmployeeDetails(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeDetails(empid);
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void addNewCustomer(Customer customer) throws EmployeeException {
		// TODO Auto-generated method stub

		customerDAO.addNewCustomer(customer);
	}

	@Override
	public void showBalance(Integer accountNumber, Integer accountPin)
			throws EmployeeException {
		// TODO Auto-generated method stub
		customerDAO.showBalance(accountNumber, accountPin);
		
	}

	@Override
	public void deposit(Integer accountNumber) throws EmployeeException {
		customerDAO.deposit(accountNumber);
	}

	@Override
	public void withdraw(Long accountNumber, Integer pin)
			throws EmployeeException {
	customerDAO.withdraw(accountNumber, pin);
		
	}

	@Override
	public List<Customer> getAllCustomer() throws EmployeeException {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomer();
	}

}
