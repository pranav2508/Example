package com.examples;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	public int getArea()
	{
		return this.height * this.width;
	}
	
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 9);
		
		System.out.println("Total area of rectangle : " + rectangle.getArea());
	}

}
