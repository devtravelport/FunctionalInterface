package com.lambda.basics;

public class numberLambda {

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
		
		printConditionally(7, a -> {
			if ((a % 2) == 0)
				return true;
			return false;
		});
		
	}
	
	private static void printConditionally(int a, numberCheck numCheck) {
		if(numCheck.check(a)) {
			System.out.println("Number is even");
		}else {
			System.out.println("not even");
		}
	}

}

interface numberCheck {
	public boolean check(int a);
}
