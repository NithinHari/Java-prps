package com.interview.JavaDev;

public class Factorial {

	static int factorialInt(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res *= i;
		}
		return res;
	}
	public static void main(String[] args) {
		int num=5;
		System.out.println(factorialInt(num));
	}
	}
