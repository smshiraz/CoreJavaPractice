package com.syed.corejava;
//Write a program to check if a string is a palindrome (ignoring non-alphanumeric characters and case)
public class PalindromeCheckIgnoringNonAlphaNumeric {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			// skip non-alphanumeric characters
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			// compare characters (ignore case)
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}
}
