package com.devlabs.lab8;

import java.util.Scanner;

public class Compare2Strings {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string value");
		str1=scan.nextLine();
		System.out.println("Enter the second string value");
		str2=scan.nextLine();
		
		scan.close();
		
		if(str1.equals(str2))
		{
			System.out.println("str1 is exactly equal to str2");
		}
		else
			System.out.println("str1 is not exactly equal to str2");

		 if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("str1 is equal to str2 ignoring the case");
		}
		 else
			 System.out.println("str1 and str2 are two different strings");
		
		 if(str1!=str2)
		{
			System.out.println("The hash values are compared and hence str1 is not equal to str2");
		}
		 
	}
	

}
