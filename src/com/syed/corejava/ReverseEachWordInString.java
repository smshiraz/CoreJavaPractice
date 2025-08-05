package com.syed.corejava;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String input = "Hello world this is Java";
		String reversed = reverseWords(input);
		System.out.println(reversed); // Output: Java is this world Hello
	}

	public static String reverseWords(String s) {
		if (s == null || s.trim().isEmpty())
			return s;
		String[] words = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i != 0)
				sb.append(" ");
		}
		return sb.toString();
	}
}
