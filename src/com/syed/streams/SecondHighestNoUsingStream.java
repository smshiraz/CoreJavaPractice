
package com.syed.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNoUsingStream {
	public static void main(String[] args) {
		 
	       
	       int[] numbers = {60,2,77,3,27,13,67,35};
		//Integer[]  numbers = {60,2,77,3,27,13,67,35};
	        
	        int secondHighestNumber = Arrays
	                .stream(numbers)
	                .boxed()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .get();
	        
	        System.out.println("Second largest number in an Arrays is - "
	                + secondHighestNumber);
	 
	
	}
}
