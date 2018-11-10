package com.capgemini.jpa.presentation;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.jpa.entity.Customer;
import com.capgemini.jpa.exception.EmployeeException;
import com.capgemini.jpa.service.CustomerServiceImpl;
import com.capgemini.jpa.service.ICustomerService;

public class Client {
	static Scanner sc=new Scanner(System.in);
	Client client=new Client();
	static ICustomerService serviceImpl= new CustomerServiceImpl();
	static Random rand = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			
			System.out.println("WELCOME TO PAYMENT WALLENT APPLICATION");
			System.out.println("******************************************************");
			System.out.println("1.CREATE ACCOUNT");
			System.out.println("2.SHOW BALANCE");
			System.out.println("3.DEPOSIT");
			System.out.println("4.WITHDRAW");
			System.out.println("5.FUND TRANSFER");
			System.out.println("6.PRINT TRANSACTION");
			System.out.println("7.EXIT");
			System.out.println("********************************************************");
			System.out.println("ENTER YOUR CHOICE");
	
	int ch=sc.nextInt();

	switch(ch){
	case 1:
		Customer customer=new Customer();
		
		getCustomerDetails(customer);
		Integer accountNumber = 100000 + rand.nextInt(1000000);
		customer.setAccountNumber(accountNumber);
		System.out.println(accountNumber);
		Integer accountPin = 1000 + rand.nextInt(9000);
		customer.setAccountPin(accountPin);
		System.out.println(accountPin);
	
		addNewCustomer(customer);
		
		System.out.println(customer);
		
		
		
		
		
		break;
	case 2:
		Customer customer2=new Customer();
		System.out.println("ENTER THE ACCOUNT NUMBER");
		Integer accountNumber1=sc.nextInt();
		System.out.println("ENTER THE ACCOUNT PIN");
		Integer accountPin1=sc.nextInt();
		
		getshowBalance(accountNumber1,accountPin1);
	
		break;
	case 3:
		Customer customer3=new Customer();
		System.out.println("ENTER THE ACCOUNT NUMBER");
		Integer accountNumber3=sc.nextInt();
		getDeposit(accountNumber3);
		
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		System.exit(0);
		break;
		default:
			break;
	}
	
}
	}

	private static void getDeposit(Integer accountNumber) {
		// TODO Auto-generated method stub
		
try{
			
			serviceImpl.deposit(accountNumber);
			
		}
			catch(EmployeeException e){
				System.out.println("CUSTOMER NOT FOUND"+e.getMessage());
				
			}
	}

	private static void getshowBalance(Integer accountNumber, Integer accountPin) {
		try{
			
			serviceImpl.showBalance(accountNumber,accountPin);
			
		}
			catch(EmployeeException e){
				System.out.println("CUSTOMER NOT FOUND"+e.getMessage());
				
			}
		
	}

	private static void getCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("ENTER YOUR NAME");
		customer.setName(sc.next());
		System.out.println("ENTER YOUR PHONE NUMBER");
		customer.setPhoneNumber(sc.next());
		System.out.println("ENTER YOUR AGE");
		customer.setAge(sc.nextInt());
		System.out.println("ENTER YOUR ADDRESS");
		customer.setAddress(sc.next());
        System.out.println("ENTER YOUR BALANCE");
		customer.setBalance(sc.nextDouble());
		System.out.println("ENTER YOUR EMAILID");
		customer.setEmailId(sc.next());
		//Long accountNumber = 10000+rand.nextLong(456); 
		

	
	}

	private static void addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub

		try{
		
			serviceImpl.addNewCustomer(customer);
			
		}
			catch(EmployeeException e){
				System.out.println("CUSTOMER NOT FOUND"+e.getMessage());
				
			}
		
		
		
	}
}
