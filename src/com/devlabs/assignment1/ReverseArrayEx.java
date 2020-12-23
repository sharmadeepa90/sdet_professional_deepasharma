package com.devlabs.assignment1;

import java.util.Scanner;

public class ReverseArrayEx {
	public static void main(String[] args) {
	int[] arr = new int[100]; //declaration
    int temp=0;
    int counter=0;
    
    Scanner scanner = new Scanner(System.in);
	System.out.println("How many elements you want to enter: ");
	counter = scanner.nextInt();
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the elements of the array");
    
    for(int i=0;i<counter;i++)
    {
        arr[i] = reader.nextInt();
    }
    
    reader.close();
    
 
      for(int i=0;i<arr.length;i++)
      {
   	   for(int j=i+1;j<arr.length;j++)
   	   {
       if(arr[i]<arr[j])
       {
       	temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   	   }
      }
      
      }
     System.out.println("The elements in desc order");
     for(int i=0;i<counter;i++)
   	  System.out.print(arr[i]+ " ");


}

}
