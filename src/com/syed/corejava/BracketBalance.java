
package com.syed.corejava;

import java.util.Stack;

public class BracketBalance {
	public static void main(String[] args) {
		String str = "{[()()]}"; 
		// "({}[])",()(()), {[()()]}
		String balnced = isBalanced(str);
		System.out.println(balnced);
 
	}

	private static String isBalanced(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return "NO";
				} else {
					char pop_val = stack.pop();
					if (s.charAt(i) == ')' && pop_val != '(') {
						return "NO";
					} else if (s.charAt(i) == ']' && pop_val != '[') {
						return "NO";
					} else if (s.charAt(i) == '}' && pop_val != '{') {
						return "NO";
					}

				}
			}

		}
		if (stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}

