package javaworld;

/**
 * Program to reverse a string.
 *
 */

public class StringReverse {

	public static void main(String[] args) {

		String original = "test";
		String reverse = "";
		
		System.out.println("The original string is: " + original);
		
		for (int i=original.length() - 1; i>=0; i--) {
			System.out.println("i is: " + i);
			reverse = reverse + original.charAt(i);
			System.out.println("reverse is: " + reverse);
			System.out.println("original.charAt(i) is: " + original.charAt(i));
		}
		System.out.println("The reverse string is: " + reverse);
	}
}