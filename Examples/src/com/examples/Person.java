package com.examples;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person()
	{
		System.out.println("Default constructor");
	}
	
	public Person(int age)
	{
		this.age = age;
		System.out.println("one argument constructor");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		Person person = new Person(26);
		person.setFirstName("Pranav");
		person.setLastName("Awadhut");
		person.setAge(26);;
		
		System.out.println("Pravav's age: " + person.getAge());
		
	}
	
}
