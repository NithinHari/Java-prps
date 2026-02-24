package com.interview.JavaDev;

public class StarPrgs {
static void printStarsLiner(int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

static void printStarsRight(int n){
	for(int i=0;i<n;i++) {
		for(int j=2*(n-i);j>=0;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

static void printTriangle(int n) {
	for(int i=0;i<n;i++) {
		
		for(int j=n-i;j>1;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
	public static void main(String[] args) {
		printStarsLiner(5);
		System.out.println();
		printStarsRight(5);
		System.out.println();
		printTriangle(5);
//		int num = 5;
//		//printTriangle(num);
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=num;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
		//}
	}

}
