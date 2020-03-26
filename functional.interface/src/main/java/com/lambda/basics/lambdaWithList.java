package com.lambda.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaWithList {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("chicku","thapliyal",6));
		personList.add(new Person("bindu","sharma",60));
		personList.add(new Person("garima","potter",13));
		personList.add(new Person("ayaan","haseen",2));
		personList.add(new Person("ayu","haseen",2));
		personList.add(new Person("ayn","haseen",2));

		personList.forEach(p -> System.out.println(p.getFirstName()));//simply print the list
		
		List<Person> sortList = personList.stream().sorted().collect(Collectors.toList());
			
		sortList.forEach(p -> System.out.println(p.getFirstName() +"**"+ p.getLastName()));//sort the list
		
		personList.stream()
		.sorted().forEach(p -> System.out.println(p.getFirstName() +"@@@@"+ p.getLastName()));
		/**
		 * here sorting and printing in one line instead of 
		 * saving it in list first and than printing
		 * 
		 */
		 
		
		personList.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName() +"--"+ p.getLastName()));
		
		
		personList.stream()
		.filter(p -> p.getFirstName().startsWith("a"))
		.filter(p -> p.getFirstName().length() == 3)
		.forEach(p -> System.out.println(p.getFirstName() +"++++++++"+ p.getLastName()));
		
		
		personList.stream()
		.forEach(p -> System.out.println(p.getFirstName().toUpperCase()));
		
		/*
		 * personList.parallelStream() .filter(p -> System.out.println("hello"));
		 * this will through compiler error as filter takes predicate and we are trying to add sysout in predicate
		 * remember predicate returns boolean but sysout operation returns void
		 * 
		 */
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(10);
		numList.add(10);
		
		
		Double d = numList.stream()
		.mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println(d);
		
		Integer t =7;
		System.out.println(t.hashCode());
	}
	
	
	
	


}
