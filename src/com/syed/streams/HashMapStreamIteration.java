package com.syed.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapStreamIteration {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 5);
		map.put("Banana", 12);
		map.put("Orange", 8);
		map.put("Mango", 15);

		System.out.println("\n1️⃣ Iterate over entries (key + value):");
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});

		System.out.println("\n2️⃣ Iterate only keys:");
		map.keySet().stream().forEach(key -> {
			System.out.println("Key: " + key);
		});

		System.out.println("\n3️⃣ Iterate only values:");
		map.values().stream().forEach(value -> {
			System.out.println("Value: " + value);
		});

		System.out.println("\n4️⃣ Filter entries (value > 10):");
		map.entrySet().stream().filter(e -> e.getValue() > 10).forEach(e -> {
			System.out.println(e.getKey() + " -> " + e.getValue());
		});

		System.out.println("\n5️⃣ Convert map to list of keys:");
		List<String> keys = map.entrySet().stream().map(Map.Entry::getKey).toList();

		System.out.println("Keys List: " + keys);

		System.out.println("\n6️⃣ Convert map to list of values:");
		List<Integer> values = map.entrySet().stream().map(Map.Entry::getValue).toList();

		System.out.println("Values List: " + values);

		System.out.println("\n7️⃣ Parallel stream iteration:");
		map.entrySet().parallelStream().forEach(entry -> System.out
				.println(Thread.currentThread().getName() + " -> " + entry.getKey() + "=" + entry.getValue()));
	}
}
