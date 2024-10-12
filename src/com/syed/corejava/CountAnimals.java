package com.syed.corejava;

import java.util.*;

public class CountAnimals {

	public static void main(String[] args) {
		String str = "The Zoo has three lions, 4 tigers, seven rhinos, 6 chimps";
		// output: Zoo has 20 Animals.
		int count = 0;
		String strArray[] = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);

		for (int i = 0; i < strArray.length; i++) {

			Set<String> keySet = map.keySet();
			Iterator<String> iterator = keySet.iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				if (strArray[i].equalsIgnoreCase(key)) {
					count = count + map.get(key);
				}

			}
			if (Character.isDigit(strArray[i].charAt(0))) {
				count = count + Character.getNumericValue(strArray[i].charAt(0));

			}
		}

		System.out.println("Zoo has " + count + " Animals");

	}

}
