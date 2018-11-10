package com.capgemini.jpa.service;

import java.util.List;

import com.capgemini.jpa.entity.Customer;
import com.capgemini.jpa.exception.EmployeeException;

public interface ICustomerService {
	public abstract void addNewCustomer(Customer customer) throws EmployeeException;
	public abstract void showBalance(Integer accountNumber,Integer accountPin) throws EmployeeException;
	public abstract void deposit(Integer accountNumber) throws EmployeeException;
	public abstract void withdraw (Long accountNumber,Integer pin) throws EmployeeException;
	public abstract List<Customer> getAllCustomer() throws EmployeeException;
}
