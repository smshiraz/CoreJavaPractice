package com.syed.corejava;

/*
 * In this program, we need to rotate the elements of an array towards the left by
 *  the specified number of times. In the left rotation, each element of the array
 *   will be shifted to its left by one position and the first element of the array 
 *   will be added to end of the list. This process will be followed for a specified number 
 *   of times.
 */
public class ArrayLeftRotaion {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int noOfRot = 1;
		for (int i = 0; i < noOfRot; i++) {
			arr = rotateArray(arr);
		}
		for (int a : arr) {
			System.out.print(a);
		}
	}

	private static int[] rotateArray(int[] arr) {

		int len = arr.length;
		int firstNo = arr[0];
		for (int i = 0; i < len - 1; i++) {//main logic
			arr[i] = arr[i + 1];//main logic --easy
		}
		arr[len - 1] = firstNo;
		return arr;
	}
}
