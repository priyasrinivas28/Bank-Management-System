package com.capgemini.jpa.presentation;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.jpa.entity.Employee;
import com.capgemini.jpa.utility.JPAUtil;

public class JPQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager=JPAUtil.getEntityManager();
	String jql1="select e from Employee e where e.job= :pjob And e.salary> :psal";
		TypedQuery<Employee> typedQuery=entityManager.createQuery(jql1,Employee.class).
				setParameter("pjob", "manager").
				setParameter("psal", 50000.0);
		List<Employee> employeeList=typedQuery.getResultList();
		//List<Employee> employeeList1=typedQuery.getSingleResult();
		showEmployees(employeeList);
		String jquery="select job from employee e where e.job= :ejob";
		TypedQuery<Employee>  typedQuery1=entityManager.createQuery(jquery,Employee.class);
		typedQuery1.setParameter("job","manager");
	Employee emp=typedQuery1.getSingleResult();

		Query query1=entityManager.createNamedQuery("q2");
		List<Employee> employeeList2=query1.getResultList();
		showEmployees(employeeList2);

	}

	private static void showEmployees(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		Iterator<Employee> iterator=employeeList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
