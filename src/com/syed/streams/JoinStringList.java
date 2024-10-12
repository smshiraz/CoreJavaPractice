package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringList {

	public static void main(String[] args) {
		List<String> str= Arrays.asList("India","Usa","Singapore","Iran");
		
		String result= str.stream().map(a->a.toUpperCase()).collect(Collectors.joining(","));
		result="["+result+"]";
		System.out.println(result);

	}

}
