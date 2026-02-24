package com.dsa.recursion;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

    public static void main(String[] args){
        sumNum(10,0);
        System.out.println(sumNum2(3));
        System.out.println(factorial(4));

        //stream method
        List<Integer> intNum = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(intNum.stream().reduce(Integer::sum).get());
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
