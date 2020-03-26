package com.lambda.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class integerList {

	public static void main(String[] args) {

		List<Integer> newList = new ArrayList<Integer>();
		newList.add(5);
		newList.add(2);
		newList.add(7);
		newList.add(16);

		String ls = newList.stream().map(x -> x % 2 == 0 ? "e" + x : "o" + x)
				.collect(Collectors.joining(","));



	}
	


}
