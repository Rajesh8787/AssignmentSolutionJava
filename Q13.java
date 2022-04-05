package com.hello;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		 int n, first, second, third, forth, fifth;
    
    n=12345;

    first = n/10000;
    n %= 10000;
    
    second = n/1000; 
    n %= 1000;
    
    third = n/100;
    n = n%100;
    
    forth = n/10;
    fifth = n/10;

    int sum = first + forth;
    System.out.println("sum: " + sum);
	}

} 

	   

	  
	}

}
