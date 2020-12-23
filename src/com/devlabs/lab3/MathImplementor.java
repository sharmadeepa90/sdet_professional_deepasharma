package com.devlabs.lab3;

public class MathImplementor implements MathsInterface, PrimeInterface{
    
    public void add(int a, int b)
    {
        System.out.println("The sum is:" + (a+b));
    }
    
    public void subtract(int a, int b)
    {
        System.out.println("The difference is:" + (a-b));
    }
    public void multiply(int a, int b)
    {
        System.out.println("The product is:" + (a*b));
    }
    
    public void divide(int a, int b)
    {
        System.out.println("The quotient is:" + (a/b));
    }
    
    
     public void checkPrime(int a) 
     { 
         System.out.println("PrimeCheck"); 
     }
     

    public static void main(String[] args)
    
    { // TODO Auto-generated method stub
        
        MathImplementor m = new MathImplementor();
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        
        scan.close();*/
        
        m.add(5,7);
        m.subtract(8,2);
        m.multiply(25,30);
        m.divide(225,14);
        
        m.checkPrime(9);
      
      }
}
