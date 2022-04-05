package com.hello;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,digit,sum=0;
		System.out.println("enter the number which do you want to add");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		while(a!=0)
		{
			
			digit=a%10;  //2
			sum=sum+digit;//2
			a=a/10;  //13
		
		
		
		}
		System.out.println(" Sum is "+sum);
		
		
	}

}
