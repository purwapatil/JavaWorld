package javaworld;

/**
 * Program to create thread using Runnable interface.
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing thread: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {

		Thread myThread = new Thread (new MyRunnable(), "myRunnable");
		myThread.start();
	}
}
