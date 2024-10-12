package com.syed.streams;

import java.util.Arrays;
// Program to count the no of words in a string
public class CountWordsString {
	public static void main(String[] args) {
		String str="I am learning java and C++";
		String strArr[]=str.split(" ");
		long count= Arrays.stream(strArr).count();
		System.out.println(count);
	}

}
