

package com.syed.streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfNos {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);
		double avg = list.stream().mapToInt(i -> i).average().getAsDouble();
		System.out.println(avg);

	}

}
