package javaworld;

/**
 * Program to check if the given number is prime or not.
 *
 */

public class NumberPrimeOrNot {

	public static void main(String[] args) {

		int number = 9;
		boolean isNumberPrime = true;
		
		System.out.println("number/2: " + number/2);
		System.out.println("Math.sqrt(number): " + Math.sqrt(number));
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			
			System.out.println("number % i: " + number % i);
			
			if (number % i == 0) {
				isNumberPrime = false;
				break;
			}
		}

		if (isNumberPrime) {
			System.out.println(number + " is a Prime number");
		}
		else {
			System.out.println(number + " is not a Prime number");
		}
	}

}
