package javaworld;

import java.util.ArrayList;

/**
 * Program to understand ArrayList.
 *
 */

public class ArrayListAdd {

	public static void main(String[] args) {

		ArrayList <Integer> evenNumbers = new ArrayList <Integer>();
		ArrayList <Integer> oddNumbers = new ArrayList <Integer>();
		
		for (int number = 1; number <= 20; number++) {
			System.out.println("number: " + number);
				if (number % 2 == 0) {
					evenNumbers.add(number);	
				}
				else {
					oddNumbers.add(number);
				}
		}

		System.out.println("List of Even numbers is: " + evenNumbers);
		System.out.println("List of Odd numbers is: " + oddNumbers);
	}
}