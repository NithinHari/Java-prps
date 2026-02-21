package com.dsa.recursion;

public class Recursion {

    public static void main(String[] args){
        //printNameFiveTimes(5,1, "Nithin");
        //printlinearNumbers(2,10);
        //printlinearNumbersReverse(2,10);
        ///printLinerNumbersBackTrack(1,10);
        //printLinerNumbersBackTrackReverse(10,1);  //wrong
      }

    public static void printNameFiveTimes(int n, int j, String s){
        if(j > n){
            return;
        }
        System.out.println(s);
        printNameFiveTimes(n,j+1, s);
    }

    public static void printlinearNumbers(int n, int m){
        if(n > m){
            return;
        }
        System.out.println(n);
        printlinearNumbers(n+1, m);
    }

    public static void printlinearNumbersReverse(int n, int m){
        if(m < n){
            return;
        }
        System.out.println(m);
        printlinearNumbersReverse(n, m-1);
    }

    public static void printLinerNumbersBackTrack(int n, int m){
        if(m<n){
            return;
        }
        printLinerNumbersBackTrack(n,m-1);
        System.out.println(m);
    }

    public static void printLinerNumbersBackTrackReverse(int n, int m){
        if(n<m){
            return;
        }
        printLinerNumbersBackTrackReverse(n-1,m);
        System.out.println(n);
    }
}

