package com.exceptions;

public class E4 {

	public static void main(String[] args) {
		System.out.println(1);
		int a=10, b=0,c;
		System.out.println(2);
		
		try {
		c=a/b;	
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("carried on");
		}
		
		System.out.println(3);

	}

}