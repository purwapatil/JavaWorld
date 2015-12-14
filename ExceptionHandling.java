package javaworld;

/** 
 * Program to understand Exception handling.
 *
 */

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3};
		
		try {
			
			System.out.println("Array length is: " + numbers.length);
			
			for (int i = 0; i <= numbers.length; i++) {

				System.out.println("numbers[" + i + "] is " + numbers[i]);
			}
		}
		
		catch (NullPointerException e) {
			System.out.println("Array is null");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}
		
		finally {
			System.out.println("Thank you");
		}
	}
}