/* 
 * Input abbac  
 * Output bac  length is 3
 * 
 * Input abcabcbb
 * Output bac    length is 3
*/

package com.syed.corejava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
				lengthOfLongestSubString("abbac");	
	}

	private static void lengthOfLongestSubString(String s) {
		String longestSubString=null;
		int longestSubStringLength=0;
		Map<Character,Integer> map= new LinkedHashMap<>();
		
		char arr[] = s.toCharArray();
		
		for(int i=0;i<arr.length; i++)
		{
			char ch=arr[i];
			
			if(! map.containsKey(arr))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
			}
		}
		
	}

}
