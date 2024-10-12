
package com.syed.corejava;


import java.util.*;

public class FindCommonElementsArray {

	public static void main(String[] args) {

		int[] arr1 = { 10, 16,7,1,18,12,10 };

		int[] arr2 = { 1, 19, 10, 6, 16 };

		System.out.println("Array 1: " + Arrays.toString(arr1));
		
		System.out.println("Array 2: " + Arrays.toString(arr2));
		findCommon(arr1, arr2);
	}

	public static void findCommon(int[] arr1, int[] arr2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// Adding elements from array1
		for (int i : arr1) {
			set1.add(i);
		}

		for (int i : arr2) {
			
			set2.add(i);
		}

		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}

}
