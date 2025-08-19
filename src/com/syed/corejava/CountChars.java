package com.syed.corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChars {

	public static void main(String[] args) {
		String str = "syed hmustafa hh";

		// Start here

		// Using Hashmap
		str = str.replace(" ", "");
		Map<Character, Integer> m = new HashMap<>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			Character c = str.charAt(i);
			if (m.get(c) != null) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		m.forEach((k, v) -> System.out.println("key=" + k + "Value=" + v));

		// Using Streams
		
		System.out.println("-----Using Streams--------");

		String str1 = "i love india and assam";
		str1 = str1.replace(" ", "");

		Map<String, Long> strCount = Arrays.asList(str1.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		strCount.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		});
	}
}
