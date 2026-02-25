package com.interview.JavaDev;

public class SumOfDigits {

    static int sumDig(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 344;
        System.out.println(sumDig(n));
    }

}
