package com.hello;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder,reverse=0;
		System.out.println("enter the number which do you want to reverse");
		Scanner sc=new Scanner (System.in);
		number=sc.nextInt();
		
		while(number != 0)   
		{  
		remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
