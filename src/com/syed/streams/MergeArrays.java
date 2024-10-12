package com.syed.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeArrays {

	public static void main(String[] args) {
				
		List<Integer> list1=List.of(7,6,4);
		List<Integer> list2=List.of(8,5,4);
	
		Stream.of(list1,list2).
			flatMap(i->i.stream())
			.forEach(System.out::print);
		
	

	}

}
