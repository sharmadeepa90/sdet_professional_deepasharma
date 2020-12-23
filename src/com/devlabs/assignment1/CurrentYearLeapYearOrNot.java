package com.devlabs.assignment1;

import java.util.*;

public class CurrentYearLeapYearOrNot {

	public static void main(String[] args) {
		int yearValue;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      yearValue = sc.nextInt();

	      if (((yearValue % 4 == 0) && (yearValue % 100!= 0)) || (yearValue%400 == 0))
	         System.out.println("The mentioned year is Leap year");
	      else
	         System.out.println("The mentioned year is not a Leap year");
	   }

	}


