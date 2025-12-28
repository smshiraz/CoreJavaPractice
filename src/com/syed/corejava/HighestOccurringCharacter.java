package com.syed.corejava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestOccurringCharacter {

	public static void main(String[] args) {

		String input = "programming";

		System.out.println("Input String: " + input);

		// Without Streams
		findHighestCharWithoutStream(input);

		// With Streams
		findHighestCharWithStream(input);
	}

	// ---------------- WITHOUT STREAMS ----------------
	public static void findHighestCharWithoutStream(String input) {

		Map<Character, Integer> countMap = new HashMap<>();

		// Count character occurrences
		for (char ch : input.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}

		char maxChar = ' ';
		int maxCount = 0;

		// Find max occurring character
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("\nWithout Streams:");
		System.out.println("Highest occurring character: " + maxChar);
		System.out.println("Count: " + maxCount);
	}

	// ---------------- WITH STREAMS ----------------
	public static void findHighestCharWithStream(String input) {

		Map.Entry<String, Long> result = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElse(null);

		System.out.println("\nWith Streams:");
		if (result != null) {
			System.out.println("Highest occurring character: " + result.getKey());
			System.out.println("Count: " + result.getValue());
		}
	}
}
