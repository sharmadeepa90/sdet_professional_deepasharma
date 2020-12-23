package com.devlabs.assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib=0, number,n1=0,n2=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fibonacci series number till where you want to print");
		number=scan.nextInt();
		
		System.out.print(n1 +",");
		System.out.print(n2);
		for(int i=2; i<number;i++)
		{
			fib=n1+n2;
	
			System.out.print( "," + fib  );
			n1=n2;
			n2=fib;
		}
			
	}

}
