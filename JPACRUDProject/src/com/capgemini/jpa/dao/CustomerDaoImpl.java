package com.capgemini.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.capgemini.jpa.entity.Customer;
import com.capgemini.jpa.exception.EmployeeException;
import com.capgemini.jpa.utility.JPAUtil;

public class CustomerDaoImpl implements ICustomerDAO {
	private EntityManager entityManager=null;

	/*public void addNewEmployee(Employee employee) throws EmployeeException {

		try{
			//entityManager=JPAUtil.getEntityManager();
			//entityManager =Persistence.createEntityManagerFactory("JPACRUDProject").createEntityManager();
			entityManager.getTransaction().begin();
			employee.setEmpid(null);
			entityManager.persist(employee);
			entityManager.getTransaction().commit();			
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}

	}

	@Override
	public void deleteEmployee(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub

		try{
			//entityManager=JPAUtil.getEntityManager();
			//entityManager =Persistence.createEntityManagerFactory("JPACRUDProject").createEntityManager();
			 entityManager=JPAUtil.getEntityManager();
			entityManager.getTransaction().begin();
			Employee employee=entityManager.find(Employee.class, empid);//utility pacakge class and the id
			entityManager.remove(employee);
			//employee.setEmpid(null);
			//entityManager.persist(employee);
			entityManager.getTransaction().commit();			
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}
	}

	@Override
	public void updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		try{
			entityManager=JPAUtil.getEntityManager();
			entityManager.getTransaction().begin();
			Employee employee=entityManager.find(Employee.class, empid);//utility pacakge class and the id
			entityManager.remove(employee);
			entityManager.merge(employee);
			entityManager.getTransaction().commit();			
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}

	}

	@Override
	public Employee getEmployeeDetails(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub
		try{
			entityManager=JPAUtil.getEntityManager();
			Employee employee=entityManager.find(Employee.class, empid);
			entityManager.getTransaction().begin();
			Employee employee=entityManager.find(Employee.class, empid);//utility pacakge class and the id
			entityManager.remove(employee);
			//			entityManager.merge(employee);
			//			entityManager.getTransaction().commit();
			return employee;
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}

	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		try{
			entityManager=JPAUtil.getEntityManager();
			entityManager.getTransaction().begin();
			Query query=entityManager.createQuery("from Employee");//its a calss name
			List<Employee> employeeList=query.getResultList();
			return employeeList;

		}catch(PersistenceException e){
			e.printStackTrace();

		}
		finally{
			entityManager.close();
		}
return null;
	}*/

	@Override
	public void addNewCustomer(Customer customer) throws EmployeeException {
		try{
			entityManager=JPAUtil.getEntityManager();
			//entityManager =Persistence.createEntityManagerFactory("JPACRUDProject").createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(customer);
			entityManager.getTransaction().commit();			
		}catch(PersistenceException e) {
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}
		
	}

	@Override
	public void showBalance(Integer accountNumber, Integer accountPin)
			throws EmployeeException {
	
		try{
			entityManager=JPAUtil.getEntityManager();
			//entityManager =Persistence.createEntityManagerFactory("JPACRUDProject").createEntityManager
			Customer cust  = entityManager.find(Customer.class, accountNumber);
			System.out.println("THE BALANCE PRESENT IN YOUR ACCOUNT IS :"+cust.getBalance());
					
		}catch(PersistenceException e) {
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}
	}

	@Override
	public void deposit(Integer accountNumber) throws EmployeeException {
		// TODO Auto-generated method stub
		try{
			entityManager=JPAUtil.getEntityManager();
			//entityManager =Persistence.createEntityManagerFactory("JPACRUDProject").createEntityManager
			Customer cust  = entityManager.find(Customer.class, accountNumber);
			Double balance1=cust.getBalance();
			System.out.println("THE BALANCE PRESENT IN YOUR ACCOUNT IS :"+cust.getBalance());
					
		}catch(PersistenceException e) {
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
		}finally {
			entityManager.close();
		}
		
	}

	@Override
	public void withdraw(Long accountNumber, Integer pin)
			throws EmployeeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomer() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}