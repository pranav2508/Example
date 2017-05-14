package com.examples;

public class Test {

	public static void main(String[] args) {
		
/*		String emp3;
		
		Employee pranav = new Employee(10);
		pranav.setFirstName("Pranav");
		pranav.setLastName("Awadhut");
		
		int id = 200;
		Employee rasik = new Employee(id);
		rasik.setFirstName("Rasik");
		rasik.setLastName("Tappe");
		
		Employee emp = pranav;
		System.out.println("empid: " + emp.getEmpId());
		System.out.println("firstname: " + emp.getFirstName());
		System.out.println("lastname: " + emp.getLastName());
		
		pranav = rasik;
		System.out.println("empid: " + pranav.getEmpId());
		System.out.println("firstname: " + pranav.getFirstName());
		System.out.println("lastname: " + pranav.getLastName());
		
	
		
		pranav = emp;
		System.out.println("empid: " + pranav.getEmpId());
		System.out.println("firstname: " + pranav.getFirstName());
		System.out.println("lastname: " + pranav.getLastName());
*/
		
		Rectangle rectangle = new Rectangle(10, 23);
		System.out.println("Area of rectangle : " + calculateArea(rectangle));
	}
	
	private static int calculateArea(Rectangle rectangle)
	{
		return rectangle.getHeight() * rectangle.getWidth();
	}
	
	
}
