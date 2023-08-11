package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String strArr[]= {"aa","vv","aa","aa","cc","vv"};
		List<String> strList=Arrays.asList(strArr);
		System.out.println(strList);
		List<String> distinctStrArr= strList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctStrArr);
		
		
	}

}
