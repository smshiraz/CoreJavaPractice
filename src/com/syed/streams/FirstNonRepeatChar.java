 package com.syed.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		String str = "i love india";
		str = str.replaceAll(" ", "");
		String fstNonRepeatChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();// for 1st repeated char
																								// use x.getvalue>1
		System.out.println("First Non Repeat character is " + fstNonRepeatChar);
	}

}
