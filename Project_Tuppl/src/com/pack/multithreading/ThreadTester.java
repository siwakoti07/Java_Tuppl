package com.pack.multithreading;

public class ThreadTester {
	public static void main(String[] args) {
		System.out.println("inside ThreadTester class !!!");
		// creating thread class with default constructor.
		Thread thread = new Thread();
		// open javadoc of the class: hold ctrl button + mouse left click

		System.out.println("default priority of thread class is : " + thread.getPriority());

		System.out.println("default name of thread class is : " + thread.getName());

		thread.setName("JustThreadClass");

		System.out.println("custom name of thread class is : " + thread.getName());

		System.out.println("Id of the thread class : " + thread.getId());

		System.out.println("is thread alive ? : " + thread.isAlive());

		System.out.println("------------------------------------------------");

		System.out.println("current thread name : " + Thread.currentThread().getName());

		System.out.println("current thread priority : " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		System.out.println("current thread custom  priority : " + Thread.currentThread().getPriority());

	}
}

