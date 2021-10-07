package com.pack.oops;

class Parent{
	public String lastname= "Smith";
	public void fortune() {
		System.out.println("Parent fortune !!");
	}
}
class Child extends Parent{
	
}
public class InheritanceTester {
   public static void main(String[] args) {
	    Child child = new Child();
	    child.fortune();
	    System.out.println(child.lastname);
	    
   }
}
