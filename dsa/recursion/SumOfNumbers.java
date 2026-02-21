package com.dsa.recursion;

public class SumOfNumbers {

    public static void main(String[] args){
        sumNum(10,0);
        System.out.println(sumNum2(3));
        System.out.println(factorial(4));
    }

    public static void sumNum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sumNum(i-1,sum+i);
    }

    public static int sumNum2(int n){
        if(n == 0) return 0;
        return n + sumNum2(n-1);
    }

    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
}
