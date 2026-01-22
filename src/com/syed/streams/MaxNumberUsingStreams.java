package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumberUsingStreams {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 45, 3, 99, 23, 67);

		// Approach 1: Using Stream<T>.max() with Comparator
		Optional<Integer> maxUsingComparator = numbers.stream().max(Integer::compareTo);

		if (maxUsingComparator.isPresent()) {
			System.out.println("Max using Comparator: " + maxUsingComparator.get());
		}

		// Approach 2: Using IntStream for better performance
		int maxUsingIntStream = numbers.stream().mapToInt(Integer::intValue).max()
				.orElseThrow(() -> new RuntimeException("List is empty"));

		System.out.println("Max using IntStream: " + maxUsingIntStream);
	}
}
