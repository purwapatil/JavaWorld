package javaworld;

import java.util.LinkedList;

/**
 * Program to reverse a linked list.
 *
 */

public class ReverseLinkedList {

	public static void main(String[] args) {

		// create a Integer linked list
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int temp;
		
		// add elements to the linked list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		// print linked list
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("numbers[" + i + "]: " + numbers.get(i));
		}

		// reverse linked list
		for (int i = 0; i < numbers.size()/2; i++) {
			temp = numbers.get(i);
			numbers.set(i, numbers.get(numbers.size()- i - 1));
			numbers.set(numbers.size()- i - 1, temp);
		}
		
		// print reverse linked list
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("numbers[" + i + "]: " + numbers.get(i));
		}
	}
}