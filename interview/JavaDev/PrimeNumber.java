package com.interview.JavaDev;

public class PrimeNumber {
	
	public static void main(String args[]) {
		int flag=0,m ;
		int n=18;
		//proof for number is even
		m=n/2;
		if(n == 0 || n == 1) {
			System.out.println(n+" is not a prime number");
		}else {
		for(int i = 2;i <= m;i++) {
			if(n%i == 0) {
				System.out.println(n+" is not a prime number");
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println(n+" is a prime number");
			}
		}
		
	}
}


