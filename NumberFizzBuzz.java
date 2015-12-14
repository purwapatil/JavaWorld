package javaworld;

/**
 * Program to print Fizzbuzz based on follwing algorithm
 * if the given number is divisible by 3, print Fizz.
 * if the given number is divisible by 5, print Buzz.
 * if the given number is divisible by both 3 and 5, print Fizzbuzz.
 *
 */
public class NumberFizzBuzz {

	public static void main(String[] args) {

		int number = 50;
		
		for (int i = 1; i <= number; i++) {
			
			if (i % (3*5) == 0) {
				System.out.println("Fizzbuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}