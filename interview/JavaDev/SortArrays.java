package com.interview.JavaDev;

import java.util.Arrays;
import java.util.Collections;

public class SortArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 8, 6, 7, 9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

//		for(int i : arr){
//			System.out.print(arr[i]);
//		}
        System.out.println();
        Integer[] arr1 = {1, 2, 3, 4, 5, 8, 6, 7, 9};
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}

