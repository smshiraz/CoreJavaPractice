package com.syed.corejava;

import java.util.Arrays;



public class PlaceZeroesToEnd {
    
    public static void main(String[] args) {
        int[] arr = {6, 0, 1, 0, 0, 3, 1, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        moveZeroes(arr);
        System.out.println("After moving zeroes: " + Arrays.toString(arr));
        
        // Test with different arrays
        int[] arr2 = {0, 1, 0, 3, 12};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        moveZeroes(arr2);
		System.out.println("After moving zeroes: " + Arrays.toString(arr2));
    }
    
    public static void moveZeroes(int[] arr) {
        if (arr == null || arr.length == 0) return;
        
        int count = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        
        // Fill remaining positions with zeroes
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
}
