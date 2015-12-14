package javaworld;

/**
 * Program to understand Static versus Non static variables and methods.
 *
 */
public class StaticVsNonStatic {
	private static String nameStatic = "Static ";
	private String nameNonStatic = "NonStatic ";
	
	public static void main(String[] args) {
		
		staticMethod();
		
		StaticVsNonStatic object = new StaticVsNonStatic();
		object.nonStaticMethod();
	}

	public static void staticMethod() {
		System.out.println("Static method " + nameStatic);
	}
	
	public void nonStaticMethod() {
		System.out.println("Non static method " + nameStatic + nameNonStatic);
	}
}