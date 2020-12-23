package com.devlabs.lab9;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ParseExceptionExample {
	 static void convertDateFormat(String inputDate)
     {
         try{
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             Date date = (Date) sdf.parse(inputDate);//parse
             System.out.println("Date is : " + date);
             
           /*  SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
             String outputDate = outputsdf.format(date);//format
             System.out.println("After changing date format to yyyy/MM/dd : "+outputDate);*/
         }
         catch(ParseException e)
         {
             e.printStackTrace();
             System.out.println("Some error occurred while converting date formats. Exception is : ");
         }
     }
     
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter date in dd/MM/yyyy format: ");
         String inputDate = scanner.nextLine();
         scanner.close();
         convertDateFormat(inputDate);
     }
}
