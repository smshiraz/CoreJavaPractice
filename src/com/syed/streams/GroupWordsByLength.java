package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
public static void main(String[] args) {
	List<String> strList=Arrays.asList("apple","banana","pear","grape");
	Map<Integer, List<String>> map=strList.stream()
			.collect(Collectors.groupingBy(String::length));
	System.out.println(map);
}
}
