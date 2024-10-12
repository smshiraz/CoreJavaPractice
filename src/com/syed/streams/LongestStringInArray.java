
package com.syed.streams;

import java.util.Arrays;

public class LongestStringInArray {

	public static void main(String[] args) {
		String strArray[]= {"java","techie","springboot","Microservices"};
		
		String longestStr=Arrays.stream(strArray).reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(longestStr);
	}

}
