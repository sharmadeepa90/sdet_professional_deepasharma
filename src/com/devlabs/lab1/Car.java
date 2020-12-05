package com.devlabs.lab1;

public class Car {
	
	int tyres=4;
	int price;
	int speed;

	public static void main(String[] args) {
		{
		     Car c = new Car(); //creation of object
		     
		     c.display("Audi"); //method call
		     c.price = 500000;
		     c.speed = 80;
		 
		     System.out.println("value of speed for c : " + c.speed); 
		     System.out.println("value of price :"+ c.price);
		     
		     Car c1 = new Car();
		     c1.display("Merc");
		     c1.price = 1000000;
		     c1.speed = 50;
		     
		     System.out.println("value of speed for c1: " + c1.speed); 
		     System.out.println("value of price :"+ c1.price);
		    }
	}
		    
		    //method - functionality
		    public void display( String m) 
		    {
		        String model ="m"; //local variable
		        System.out.println("The model is:" + m);
		        System.out.println("The price is"+ price);
		      
		    }

		}
