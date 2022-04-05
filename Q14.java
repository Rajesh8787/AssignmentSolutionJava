package com.hello;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5696;                                            // Ans : 7818

        int first  = n/1000+2;                                   //first = 7
 
        n = n%1000;                                              // n = 696
        int second = n/100+2;                                    // second =  8 
        
        n = n%100;                                               // n =  96
        int third = n/10+2;                                      // third = 11
        third = third/10;                                        // third = 1
        
        n = n%10;                                                // n = 6      
        int fourth = n+2;                                        // fourth = 8
        
        String result = Integer.toString(first)+Integer.toString(second)+Integer.toString(third)+Integer.toString(fourth);
                
        System.out.println(result);

	}

}
