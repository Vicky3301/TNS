package com.tnsif.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {

		int a=10;
		int b= 20;
		int x=10;
		
		System.out.println("a and b value"
				+ " before the opetration : "+a+" "+b);
		
		++a;
		//     12    20   12
		int c= ++a + b + a--;
		System.out.println("c value after the operations :"+c);
		
		int d = c++ + a + b--;
		System.out.println("D value after the opeartion s: "+d);
		
		System.out.println("a, b,c,d values after the opeartions"
				               + " :"+a+" "+b+" "+c+" "+d);
		
		
	}

}
