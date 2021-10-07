package com.pack.nestedclass;

class Remote{
	
	public void fun1() {
		System.out.println("The fun1() starts.");
		
		class RemoteType{
			public void fun2() {
				System.out.println("The remote type is bluetooth.");
			}
		}
		RemoteType type = new RemoteType();
		type.fun2();
		
		System.out.println("The fun1() ends.");
	}
}


public class MethodLocalClassTester {

	public static void main(String[] args) {
		Remote remote = new Remote();
		remote.fun1();
	}

}
