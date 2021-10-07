package com.pack.nestedclass;

class Outer{
	public void dummy() {
		System.out.println("This is dummy function from outer class.");
	}
	static class Inner{
		public void demo() {
			System.out.println("This is demo function from static inner class.");
		}
	}
}

public class StaticNestedClassTester {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.dummy();
		Outer.Inner inner = new Outer.Inner();
		inner.demo();
	}

}
