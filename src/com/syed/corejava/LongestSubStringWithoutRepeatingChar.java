package com.syed.corejava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		System.out.println(LengthOfLongestSubstring("java")); // jav
		System.out.println(LengthOfLongestSubstring("abcabcbb")); // abc
		System.out.println(LengthOfLongestSubstring("pwwkew")); // wke
	}

	public static String LengthOfLongestSubstring(String s) {

		if (s == null || s.isEmpty()) {
			return "";
		}

		String longestSubstring = "";
		int longestSubstringLength = 0;

		Map<Character, Integer> map = new LinkedHashMap<>();

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			char ch = arr[i];

			// If duplicate found, save current substring before clearing
			if (map.containsKey(ch)) {

				if (map.size() > longestSubstringLength) {
					longestSubstringLength = map.size();

					StringBuilder sb = new StringBuilder();
					for (char c : map.keySet()) {
						sb.append(c);
					}
					longestSubstring = sb.toString();
				}

				map.clear();
			}

			// Add current character
			map.put(ch, i);
		}

		// Final check (important if longest substring is at the end)
		if (map.size() > longestSubstringLength) {
			StringBuilder sb = new StringBuilder();
			for (char c : map.keySet()) {
				sb.append(c);
			}
			longestSubstring = sb.toString();
		}

		return longestSubstring;
	}
}
