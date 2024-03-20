package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(1,3,3,2,3,4,5,1);
		
		List<Integer> distinctNums = nums.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctNums);
		
		String[] str = {"Nithin","Karthik","Krish","Krishna","Arjun","Nithin","Arjun"};
		
		Stream<String> streamStr = Arrays.stream(str); 
		List<String>  strDistinct = streamStr.distinct().collect(Collectors.toList());
		
		System.out.println(strDistinct);
		
		List<Integer> num2 = Arrays.asList(1,2,3,4,4,5,5,2);
		List<Integer> numsDis = num2.stream().distinct().collect(Collectors.toList());
		System.out.println(numsDis);
		
		int[] numMethod = {1,2,3,4,4,5,5,2,6};
		Stream<Integer> numsStream = Arrays.stream(numMethod).boxed();
		List<Integer> numsDist = numsStream.distinct().collect(Collectors.toList());
		System.out.println(numsDist);
		
 	}

}
