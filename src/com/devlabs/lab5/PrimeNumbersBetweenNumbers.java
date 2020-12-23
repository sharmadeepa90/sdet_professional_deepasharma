package com.devlabs.lab5;

import java.util.Scanner;

public class PrimeNumbersBetweenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number: ");

		int low = scan.nextInt();

		System.out.println("Enter the second number: ");

		int high = scan.nextInt();

		

		scan.close();

		if(low>=high) {

			 System.out.println("Input not as expected");

			 }

		while (low < high) 

		{

		            boolean flag = false;

		            for(int i = 2; i <= low/2; ++i) 

		            {

		                // conditions for non-prime number

		                if(low % i == 0) {

		                    flag = true;

		                    break;

		                }

		            }

		            if (!flag)//if(flag==false)

		                System.out.print(low + " ");

		            low++;

		  }

		

		

	}
}
