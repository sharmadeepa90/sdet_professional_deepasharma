package com.devlabs.lab12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JoinListsAddAll {
	
	public static void main(String args[])
	{
		List<String> list1=new ArrayList<String>();
		list1.add("Hello");
		list1.add("World");
		
		List<String>list2=new ArrayList<String>();
		list2.add("The black");
		list2.add("Animal");
		
		list1.addAll(list2);
		for(int i=0;i<list1.size();i++)
		{
	             System.out.println(" " +list1.get(i)); 
	           }  
		
	}

}
