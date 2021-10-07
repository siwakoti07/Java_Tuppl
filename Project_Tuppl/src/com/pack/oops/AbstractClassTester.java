package com.pack.oops;

abstract class School{
	public void location() {
		System.out.println("location of school!!");
	}
	public abstract void lab(); //declaration of method
}
class SeniorStudent extends School{
	//defination of method
	public void lab() {
		System.out.println("I can access Chemictry lab.");
	}
}
public class AbstractClassTester {

	public static void main(String[] args) {
		SeniorStudent student = new SeniorStudent();
		student.lab();
		student.location();

	}

}
