package com.syed.corejava;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs1 = { "flower", "flow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		String[] strs3 = { "interspecies", "interstellar", "interstate" };

		System.out.println("LCP: " + longestCommonPrefix(strs1)); // "fl"
		System.out.println("LCP: " + longestCommonPrefix(strs2)); // ""
		System.out.println("LCP: " + longestCommonPrefix(strs3)); // "inters"
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];

		// Find the shortest string length
		int minLength = Integer.MAX_VALUE;
		for (String str : strs) {
			minLength = Math.min(minLength, str.length());
		}

		// Compare characters at each position
		for (int i = 0; i < minLength; i++) {
			char currentChar = strs[0].charAt(i);

			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != currentChar) {
					return strs[0].substring(0, i);
				}
			}
		}

		return strs[0].substring(0, minLength);
	}
}