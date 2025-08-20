package com.syed.corejava;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight" };
		//String[] arr2 = { "dog", "racecar", "car" };
		//String[] arr3 = { "interspecies", "interstellar", "interstate" };

		System.out.println("LCP: " + longestCommonPrefix(arr)); // "fl"
		//System.out.println("LCP: " + longestCommonPrefix(arr2)); // ""
		//System.out.println("LCP: " + longestCommonPrefix(arr3)); // "inters"
	}

	// Shrinks a running prefix against each word until all share it.
	public static String longestCommonPrefix(String[] arr) {
		if (arr == null || arr.length == 0)
			return "";
		if (arr.length == 1)
			return arr[0];

		String prefix = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix = commonPrefix(prefix, arr[i]);
			if (prefix.isEmpty())
				break;
		}
		return prefix;
	}

	private static String commonPrefix(String a, String b) {
		int limit = Math.min(a.length(), b.length());
		int i = 0;
		while (i < limit && a.charAt(i) == b.charAt(i))
			i++;
		return a.substring(0, i);
	}
}