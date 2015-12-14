package javaworld;

/**
 * Program to understand Method overloading.
 * 
 * Whenever there is method overloading, the JVM will search for the method 
 * from the most specific type to least specific type - here string or integer are more
 * specific than object. 
 * 
 * But cannot have both string and integer as both are same, compiler
 * will not know who to call, so will get a compile time error.
 *
 */

public class MethodOverloading {

	public static void main(String[] args) {
		functionMethodOverloading(null);
		
		if(null == null){
			System.out.println("Null");
		}
	}

	/*public static void functionMethodOverloading(Integer i) {
		System.out.println("Integer");
	}*/
	
	/*public static void functionMethodOverloading(String s) {
		System.out.println("String");
	}*/
	
	public static void functionMethodOverloading(Exception e) {
		System.out.println("Exception");
	}

	public static void functionMethodOverloading(ArithmeticException ae) {
		System.out.println("Arithmetic exception");
	}
	
	public static void functionMethodOverloading(Object o) {
		System.out.println("Object");
	}
}