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

		Map<Character, Integer> lastSeen = new HashMap<>();
		int maxLen = 0, start = 0;
		int maxStart = 0; // Start index of the max substring

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= start) {
				start = lastSeen.get(ch) + 1;
			}
			lastSeen.put(ch, i);
			if (i - start + 1 > maxLen) {
				maxLen = i - start + 1;
				maxStart = start;
			}
		}

		String result = s.substring(maxStart, maxStart + maxLen);
		System.out.println("Output: " + result + "  length is " + maxLen);
	}
}