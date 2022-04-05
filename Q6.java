package com.hello;




public class Q6 {

	  
	
	static int power(int base, int exponent)  
	{  
	int power = 1;  
	
	for (int i = 1; i <= exponent; i++)   
	 
	power = power * base;  
	
	return power;  
	}  
	 
	public static void main(String args[])  
	{  
	int base=7, exponent=5;  
	int pow=power(base, exponent);  
	
	System.out.println(base +" to the power " +exponent + " is: "+pow);  
	}  
	}  

