package com.hello;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		 int n, sum=0, firstDigit, lastDigit;
	    System.out.println("Enter a 5-digit number\n");

	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    
	   
	   
	   
	    lastDigit = n % 10;
	  
	    while(n >= 10)
	    {
	        n = n / 10;
	    }
	    firstDigit = n;
	   
	    sum = firstDigit + lastDigit;
	    System.out.println("Sum of first and last digit = %d"+ sum);
	}

} 

	   

	  
	}

}
