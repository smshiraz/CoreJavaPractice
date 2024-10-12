package com.syed.corejava;

import java.util.stream.Stream;

public class FindOutput1 {

	public static void main(String[] args) {
		Stream.of("a", "b", "c", "d", "e")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	}

}
