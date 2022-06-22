package com.AhmadsCode.Recursion;

public class Factorial {
	
	static int fact (int n) {
		if ( n == 1 ) 
			
		// base condition	
			return 1;
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1 = fact(10);
		int result2 = fact(5);
		int result3 = fact(20);
		int result4 = fact(2);
		int result5 = fact(11);
		
		System.out.println("10! = " + result1);
		System.out.println("5! = " + result2);
		System.out.println("20! = " + result3);
		System.out.println("2! = " + result4);
		System.out.println("11! = " + result5);

	}

}
