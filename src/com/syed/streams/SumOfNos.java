package com.syed.streams;


import java.util.Arrays;
import java.util.List;


class SumOfNos {
	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(arr);
		
		

		System.out.println(sum(list));
	}

	public static int sum(List<Integer> list) {

		return list.stream().mapToInt(i -> i).sum();
		
		//Also we can use 
		//Optional<Integer> sum =list.stream().reduce((a,b)->a+b);
		//return sum.get();
	}
}