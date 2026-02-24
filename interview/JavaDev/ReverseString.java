package com.interview.JavaDev;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]) {
//		Method1
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		String str = "Nithin", rev="";
		char ch;
		
		for(int i = 0;i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
		
	}
}
