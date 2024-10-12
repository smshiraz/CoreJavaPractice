package com.syed.corejava;

import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {
public static void main(String[] args) {
	

		Integer[] arr1 = { 10, 16,7,1,18,12,10 };

		Integer[] arr2 = { 1, 19, 10, 6, 16 };

		System.out.println("Array 1: " + Arrays.toString(arr1));
		
		System.out.println("Array 2: " + Arrays.toString(arr2));
		findCommon(arr1, arr2);
	}

	public static void findCommon(Integer[] arr1, Integer[] arr2) {
		
		List<Integer> l1=Arrays.asList(arr1);
		List<Integer> l2=Arrays.asList(arr2);
		
		l1.stream().filter(l2::contains).distinct().forEach(System.out::println);
		
}
}
