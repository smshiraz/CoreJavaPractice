package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesByStream {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(5, 1, 8, 9, 4, 1, 9, 9);

		List<String> strList = Arrays.asList("aa", "bb", "cc", "aa", "aa", "cc");

		Map<Integer, Long> noCount = intList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		noCount.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		}
		);
		
		Map<String, Long> strCount = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		strCount.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		}
		);

	}

}
