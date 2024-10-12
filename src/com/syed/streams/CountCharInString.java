
package com.syed.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInString {
// count the occurrences of each character in a string
	public static void main(String[] args) {
		
		String str="i love india and assam";
		str=str.replace(" ","");
		
		Map<String, Long> strCount = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		strCount.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		}
		);
		
	}
}

