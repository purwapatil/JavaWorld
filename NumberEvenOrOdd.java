package javaworld;

/**
 * Program to check if the given numbers are even or odd.
 *
 */

public class NumberEvenOrOdd {

	public static void main(String[] args) {

		int numberOne = 4;
		int numberTwo = 2;
		
		if (numberOne % 2 == 0) {
			System.out.println(numberOne + " is an Even number");
		}
		else {
			System.out.println(numberOne + " is an Odd number");
		}
		
		if ((numberTwo & 1) == 0) {
			System.out.println(numberTwo + " is an Even number");
		}
		else {
			System.out.println(numberTwo + " is an Odd number");
		}
	}
}