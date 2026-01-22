package com.syed.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLengthStringUsingStreams {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Java", "SpringBoot", "Microservices", "API", "Hibernate");

		// Using Comparator.comparing with Stream.max()
		Optional<String> longestString = names.stream().max(Comparator.comparing(String::length));

		longestString.ifPresent(s -> System.out.println("Longest String: " + s));
	}
}
