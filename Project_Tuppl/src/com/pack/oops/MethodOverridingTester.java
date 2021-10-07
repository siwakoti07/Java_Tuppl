package com.pack.oops;

class Animal{
	public void speak() {
		System.out.println("animal speaks");
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("dog barks");
	}
}

public class MethodOverridingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.speak();
	}

}
