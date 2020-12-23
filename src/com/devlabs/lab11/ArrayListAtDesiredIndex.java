//Lab 11 Solution 1


package com.devlabs.lab11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAtDesiredIndex {


	    public static void main(String[] args) {
	        List item = new ArrayList();
	        
	        item.add("Amit");
	        item.add("Suvendu");
	        item.add("Sruti");
	        
	         for(int j=0;j<item.size();j++)
	           {  
	             System.out.println("Item at index : "+ j + " is " + item.get(j)); 
	           }  
	        
	         item.add(1, "Sidhu");
	         
	         System.out.println("---------------------------------"); 
	         
	         for(int j=0;j<item.size();j++)
	           {  
	             System.out.println("Item at index : "+ j + " is " + item.get(j)); 
	           }
	         
	    }

	}


