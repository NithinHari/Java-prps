package com.interview.JavaDev;

import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();

//		Method-1
//		int x=23, y=25;
//		x = x+y;
//		y=x-y;
//		x=x-y;
        int x = 23, y = 25, t;
        t = x;
        x = y;
        y = t;


        System.out.println(x + " " + y);
    }

}
/* 
using tempor var t
a=1, b=2
t=a
a=b
b=t
b=


not using temp

x=1, y=2
x=x+y
y=x-y
x=x-y;
 */