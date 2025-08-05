package com.syed.streams;

import java.util.Arrays;
import java.util.List;

public class StringStartingWithNumber {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1Orange", "Banana", "2Papaya", "Grapes", "3Pineapple", "Cherry");

		list.stream().filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0))).forEach(System.out::println);
	}
}
