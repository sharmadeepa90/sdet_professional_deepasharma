package com.devlabs.assignment1;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int number,i;
		double fact=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		number=scan.nextInt();
		for(i=1; i<number;i++)
		{
			fact=fact*i;
			
			//System.out.println("The factorial of number is"+ fact);


		}
		System.out.println("The factorial of number is "+ fact);
	}

}
