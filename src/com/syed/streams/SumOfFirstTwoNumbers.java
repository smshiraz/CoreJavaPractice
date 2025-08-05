package com.syed.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfFirstTwoNumbers {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(87, 45, 35, 74, 325, 98, 41);

	        int sumOfTwoNumbers = numbers.stream()
	            .limit(2)
	            .mapToInt(i->i)
	            .sum();

	        System.out.println("Sum of first two numbers = " + sumOfTwoNumbers);
	    }
	}

