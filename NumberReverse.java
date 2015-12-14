package javaworld;

/**
 * Program to reverse a number.
 *
 */

public class NumberReverse {

	public static void main(String[] args) {

		int number = 12345;
		int reverse = 0;

		System.out.println("Number is: " + number);
		
		while (number > 0) {
			System.out.println("number%10: " + number%10);
			System.out.println("reverse*10: " + reverse*10);
			reverse = number%10 + (reverse*10);
			number = number/10;
			System.out.println("number/10: " + number/10);
		}
		
		System.out.println("Reverse is: " + reverse);
		
		int numberRec = 12345;
		System.out.println("Reverse recurring is: ");
		reverseNumber(numberRec);
	}
	
	public static void reverseNumber (int number) {
		System.out.println("number: " + number);
		if (number < 10) {
			System.out.println(number);
		}

		else {
			System.out.println(number%10);
			reverseNumber(number/10);
		}
	}
}