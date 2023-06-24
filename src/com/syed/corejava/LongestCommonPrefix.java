package com.syed.corejava;


/*Write a function to find the longest common prefix string among an
array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strArray[] = ["good","god","going"]
Output: "go"
Example 2:
Input: strsArray[] = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/
public class LongestCommonPrefix {

	public static void main(String args[]) {

		String strArray[] = { "flower", "flow", "flight" };
		System.out.println(lcp(strArray));
	}

	public static String lcp(String[] sArray) {
		if (sArray == null || sArray.length == 0)
			return "";
		
		for (int i = 0; i < sArray[0].length(); i++) {
			char c = sArray[0].charAt(i);
			for (int j = 1; j < sArray.length; j++) {
				if (i == sArray[j].length() || sArray[j].charAt(i) != c)
					return sArray[0].substring(0, i);
			}
		}
		 
		return sArray[0];
	}

	
	
}