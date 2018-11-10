package com.capgemini.jpa.entity;


import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/*@NamedQueries(
		{
		@NamedQuery(name="q1",query="select e from Employee e"),
		@NamedQuery(name="q2", query="select e from Employee e where e.salary> 50000.0")
		
}
)*/
@Entity		
@Table(name="customer_details")
public class Customer {
@Id
	@Column(name="acc_no",length=30,nullable=false)
	private Integer accountNumber;
	@Column(name="cust_name",length=30,nullable=false)
	private String name;
	/*@Temporal(TemporalType.DATE)
	private Calendar date;*/
	private String phoneNumber;
	private String emailId;
	private Integer accountPin;
	private String address;
	private Integer age;
	private Double balance;
	
	public Customer() {
		
	}

	/*public Calendar getHiredate() {
		return hiredate;
	}*/
/*public String getHiredate()
{
	return hiredate.get(Calendar.DATE)+"/"+
hiredate.get(Calendar.MONTH)+"/"+
			
hiredate.get(Calendar.YEAR);
}*/
	/*public String getHiredate() {
		
		String hdate=date.get(Calendar.DATE)+"/"+
				date.get((Calendar.MONTH)+ 1)+"/"+
				date.get(Calendar.YEAR);
	
		return hdate;
	}
public void setHiredate(Calendar hiredate) {
		this.date = hiredate;
	}
*/



public Integer getAccountNumber() {
	return accountNumber;
}




public void setAccountNumber(Integer accountNumber) {
	this.accountNumber = accountNumber;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getPhoneNumber() {
	return phoneNumber;
}




public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Double getBalance() {
	return balance;
}


public void setBalance(Double balance) {
	this.balance = balance;
}
public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Integer getAccountPin() {
	return accountPin;
}




public void setAccountPin(Integer accountPin) {
	this.accountPin = accountPin;
}

@Override
public String toString() {
	return "Customer [accountNumber=" + accountNumber + ", name=" + name
			+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
			+ ", accountPin=" + accountPin + ", address=" + address + ", age="
			+ age + ", balance=" + balance + "]";
}

}
