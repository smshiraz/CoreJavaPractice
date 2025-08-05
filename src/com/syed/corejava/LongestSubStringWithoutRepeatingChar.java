/* 
 * Input abbac  
 * Output bac  length is 3
 * 
 * Input abcabcbb
 * Output bac    length is 3
*/

package com.syed.corejava;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {
	public static void main(String[] args) {
		lengthOfLongestSubString("abbac");
		lengthOfLongestSubString("abcabcbb");
		lengthOfLongestSubString("pwwkew");
	}

	private static void lengthOfLongestSubString(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("Length: 0");
			return;
		}

		Map<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		int start = 0;
		String longestSubString = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// If character is already in map, update start position
			if (map.containsKey(ch)) {
				start = Math.max(start, map.get(ch) + 1);
			}

			// Update the character's position
			map.put(ch, i);

			// Check if current substring is longer
			int currentLength = i - start + 1;
			if (currentLength > maxLength) {
				maxLength = currentLength;
				longestSubString = s.substring(start, i + 1);
			}
		}

		System.out.println("Input: " + s);
		System.out.println("Longest substring: " + longestSubString);
		System.out.println("Length: " + maxLength);
		System.out.println();
	}

}
