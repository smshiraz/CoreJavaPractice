


package com.syed.streams;

import java.util.Arrays;
import java.util.List;

//Check if all the list elements are divisible by 2
//Input [2,4,5 ,6, 8]
//Print All the nos are not divisible by 2
public class AllDivisibleByTwo {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,4,5,8);
		boolean isDivisiblebytwo=intList.stream().allMatch(n->n%2==0);
		//To check at least one no is divisible by 2 Use stream().anyMatch()
		if(isDivisiblebytwo)
		{
		System.out.println("All the nos are  divisible by 2");
		}
		else
		{
			System.out.println("All the nos are not  divisible by 2");
		}
		
	}

}
