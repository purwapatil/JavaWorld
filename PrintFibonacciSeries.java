package javaworld;

import java.util.Scanner;

/**
 * Program to print fibonacci series.
 * 
 */

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number;
				
		System.out.println("Enter a number");
		number = s.nextInt();
		
		System.out.println("number: " + number);
		s.close();
		
		for (int i = 1; i <= number; i++) {
			System.out.println(functionPrintFibonacciSeries(i));
		}
	}
	
	public static int functionPrintFibonacciSeries(int number) {
		
		int number1 = 1;
		int number2 = 1;
		int number3 = 1;
		
		if (number == 1 || number == 2) {
			return 1;
		}
		
		for (int i = 3; i <= number; i++) {
			number1 = number2;
			number2 = number3;
			number3 = number1 + number2;
		}
			
		return number3;	
	}
	
	/*public static void main(String[] args) {
		int number = 10;
		
		functionPrintFibonacciSeries(number);
	}
	
	public static void functionPrintFibonacciSeries (int number) {
		
		int[] series = new int[number]; 
		
		int fibonacci1 = 1;
		int fibonacci2 = 1;
		int fibonacci3 = fibonacci1 + fibonacci2;
		
		int i;
		
		series[0] = fibonacci1;
		series[1] = fibonacci2;
		
		for (i = 2; i < number; i++) {
			series[i] = fibonacci3;
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci3;
			fibonacci3 = fibonacci1 + fibonacci2;
		}
		
		for (i = 0; i < number; i++) {
			System.out.println("series[" + i + "]: " + series[i]);
		}
	}*/
}