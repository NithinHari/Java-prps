package com.interview.JavaDev;

public class CountInt {

	
	static int count(long n) {
		int count =0;
		while (n!=0) {
			n=n/10;
			++count;
		}
		return count;
	}
	public static void main(String[] args) {
		
		long n =123453245;
		System.out.println(count(n));
	}

}

