package com.syed.corejava;

import java.util.Stack;

public class BracketBalance {
	public static void main(String[] args) {
		String[] testCases = { "{[()()]}", "({}[])", "()(())", "{[()()]}", "{[()]}", "{[()", "}", "" };

		for (String testCase : testCases) {
			String result = isBalanced(testCase);
			System.out.println("'" + testCase + "' -> " + result);
		}
	}

	private static String isBalanced(String s) {
		// Handle null or empty string
		if (s == null || s.isEmpty()) {
			return "YES";
		}

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			// Push opening brackets onto stack
			if (isOpeningBracket(currentChar)) {
				stack.push(currentChar);
			}
			// Handle closing brackets
			else if (isClosingBracket(currentChar)) {
				// If stack is empty, we have a closing bracket without matching opening
				if (stack.isEmpty()) {
					return "NO";
				}

				char topChar = stack.pop();

				// Check if brackets match
				if (!areBracketsMatching(topChar, currentChar)) {
					return "NO";
				}
			}
		}

		// Check if all brackets are closed
		return stack.isEmpty() ? "YES" : "NO";
	}

	private static boolean isOpeningBracket(char c) {
		return c == '(' || c == '{' || c == '[';
	}

	private static boolean isClosingBracket(char c) {
		return c == ')' || c == '}' || c == ']';
	}

	private static boolean areBracketsMatching(char opening, char closing) {
		return (opening == '(' && closing == ')') || (opening == '{' && closing == '}')
				|| (opening == '[' && closing == ']');
	}
}
