package com.syed.corejava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {

		String str = "programming";

		// Approach 1
		List<String> l = Arrays.stream(str.split("")).distinct().collect(Collectors.toList());
		System.out.println(l);
		// or
		// Arrays.stream(str.split("")).distinct().forEach(System.out::print);

		// Approach 2
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int idx = str.indexOf(c, i + 1);
			if (idx == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb);

		// Approach 3

		StringBuffer sb1 = new StringBuffer();
		Set<Character> s = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}

		for (char c : s) {
			sb1.append(c);
		}
		System.out.println(sb1);

	}
}
