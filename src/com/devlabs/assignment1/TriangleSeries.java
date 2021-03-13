package com.devlabs.assignment1;

public class TriangleSeries {
	
	       public static void main(String[] args) 
	       {
	              //int i=0,j=0,count=0;
	              char [][] arr= new char [11][10];
	              
	              for (char i = 0; i < 11; i++)
	              {
	                     for (int j = 0; j < 10; j++) 
	                     {
	                           arr[i][j]='0';
	                           
	                     }
	                     
	              }
	                     for (int m =1; m < 11; m++)
	                     {
	                           for (int n = 11; n >=m ; n--) 
	                           {
	                                  System.out.print(" "); 
	                           }
	                           for (int p = 0; p < m; p++) 
	                           {
	                                  
	                                  System.out.print(arr[m][p]+" ");
	                                  
	                           }
	                           System.out.println(" ");
	                           
	                     }
	       
	       }
	       
	}



