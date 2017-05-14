package com.examples;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private long salary;
	
	public Employee(int empId)
	{
		System.out.println("Initiating employee object with empid:" + empId);
	}

	public long calculateSalary(int taxPercentage)
	{
		long finalSalary = salary * 100/taxPercentage;
		return finalSalary;
	}
	
	public int getEmpId() {

		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
		
	

}
