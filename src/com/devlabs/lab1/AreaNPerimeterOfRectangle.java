package com.devlabs.lab1;

public class AreaNPerimeterOfRectangle {
	
	int length;
	int breadth;
	double area;
	double perimeter;

	public static void main(String[] args)
	{
	
	AreaNPerimeterOfRectangle a =new AreaNPerimeterOfRectangle();
	a.length=20;
	a.breadth=10;
	a.area();
	a.perimeter();
		
	
	}
	public void area()
	{
		area=length* breadth;
System.out.println("Area of Rectangle is "+ area);
	}

	public void perimeter()
	{
		perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle is "+ perimeter);
	}
}
