package com.devlabs.assignment2;

import java.util.Scanner;

public class OddNumbersinRange {

	public static void main(String[] args) {
		int min=79, max=187;
			
		
		findOdd(min, max);	
	}
	
	public static void findOdd(int min, int max)
	{
		int i;
		if(min % 2 != 0)
		{
			min++;
		}
		for(i = min; i <= max; i++)
		{
			if(i % 2 == 1)
			{
				System.out.print(i +"\t"); 
			}
		}	
	}

	}


