package javaworld;

/**
 * Program to compare two strings.
 *
 */

public class StringCompare {

	public static void main(String[] args) {

		String a = "Test";
		String b = "test";
		String c = "Test";
		
		System.out.println("a.compareTo(b): " + a.compareTo(b));
		System.out.println("a.compareToIgnoreCase(b): " + a.compareToIgnoreCase(b));
		
		System.out.println("a==b: " + a==b);
		System.out.println("a.equals(b): " + a.equals(b));
		System.out.println("a==c: " + a==c);
		System.out.println("a.equals(c): " + a.equals(c));
	}
}