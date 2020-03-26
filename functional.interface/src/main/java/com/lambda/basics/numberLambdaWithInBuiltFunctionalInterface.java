package com.lambda.basics;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class numberLambdaWithInBuiltFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * numberCheck checkOdd = a -> { 
		 * if ((a % 2) == 0) return true; 
		 * return false; else keyword is not required but it is an if-else statement
		 * where if division is 0 return true else return false
		 * }; when lambda is more that one line curly braces is used
		 * 
		 * boolean x = checkOdd.check(6); System.out.println(x);
		 */
		
		printConditionally(10, a -> {
			if ((a % 2) == 0)
				return true;
			return false;
		});
		
		printConditionallyWithConsumer(11, a -> {
			if ((a % 2) == 0)
				return true;
			return false;
		},"EVEN", t-> System.out.println(t));
		
	}
	
	private static void printConditionally(int a, Predicate<Integer> numCheck) {
		if(numCheck.test(a)) {
			System.out.println("Number is even");
		}else {
			System.out.println("not even");
		}
	}
	
	
	/*
	 * Here I have added consumer functional interface to do sysout but for that since we have to print even or odd i have to paas that String.
	 * In previous implementation above I was printing ecven odd without much fuss. In this using consumer is not a great design
	 * 
	 */
	private static void printConditionallyWithConsumer(int a, Predicate<Integer> numCheck, String t,Consumer<String> consumer) {
		if(numCheck.test(a)) {
			consumer.accept(t);
		}
	}

}

/*
 * interface numberCheck { public boolean check(int a); }
 */
