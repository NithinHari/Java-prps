package com.interview.JavaDev;

public class FibonacciWithRecurssion {
	
	static int n1=0, n2=1, n3;
	
	static void fibnacciNumber(int count) {
		if(count>0) {
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);   
			fibnacciNumber(count-1);
		}
	}
	
	public static void main(String args[]) {
		int count =10;
		System.out.print(n1+" "+n2);
		fibnacciNumber(count - 2);
		System.out.println();
	}
}
