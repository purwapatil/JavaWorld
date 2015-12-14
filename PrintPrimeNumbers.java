package javaworld;

/**
 * Program to print prime numbers.
 *
 */

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		// a prime number is a number that is divisible only by itself and 1
		int number = 50;
		boolean[] arrayPrime = new boolean[number];
		
		// initially set all the array values to true 
		for (int count = 0; count < number; count++) {
			arrayPrime[count] = true;
		}

		for (int i = 2; i <= number; i++) {
			
			if (arrayPrime[i-1] == true) {
				System.out.println("prime number: " + i);
			}
			
			for (int j = 2*i; j <= number; j+=i) {
				System.out.println("j: " + j);
				arrayPrime[j-1] = false;
			}
		}
	}
}