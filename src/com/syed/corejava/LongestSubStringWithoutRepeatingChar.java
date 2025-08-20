package com.syed.corejava;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {
	public static void main(String[] args) {
		printLongestUniqueSubstring("abbac");
		printLongestUniqueSubstring("abcabcbb");
		printLongestUniqueSubstring("pwwkew");
	}

	private static void printLongestUniqueSubstring(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("Output:  Length is 0");
			return;
		}

		Map<Character, Integer> lastIndex = new HashMap<>();
		int start = 0, maxStart = 0, maxLen = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (lastIndex.containsKey(ch) && lastIndex.get(ch) >= start) {
				start = lastIndex.get(ch) + 1;
			}
			lastIndex.put(ch, i);

			int currentLen = i - start + 1;
			if (currentLen > maxLen) {
				maxLen = currentLen;
				maxStart = start;
			}
		}

		String result = s.substring(maxStart, maxStart + maxLen);
		System.out.println("Output: " + result + "  length is " + maxLen);
	}
}