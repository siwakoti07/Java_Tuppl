package com.pack.nestedclass;

class Animal{
	public void voice() {
		System.out.println("Animals voices!");
	}
	class Dog{
		public void speaks() {
			System.out.println("Dog barks.");
			voice();
		}
		
	}
}

public class InnerClassTester {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.voice();
		Animal.Dog dog = animal.new Dog();
		dog.speaks();

	}

}
