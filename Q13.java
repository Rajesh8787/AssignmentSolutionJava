package com.hello;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		 int n, sum, first,second,third,forth,fifth;
	    System.out.println("Enter a 5-digit number\n");

	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    
	   
	   
	   
	    n=12345;

	    first = n/10000;
	    n %= 10000;
	    
	    second = n/1000; 
	    n %= 1000;
	    
	    third = n/100;
	    n = n%100;
	    
	    forth = n/10;
	    fifth = n/10;

	    sum = first + forth;
	    System.out.println("sum: " + sum);
	}

} 

	   

	  
	


