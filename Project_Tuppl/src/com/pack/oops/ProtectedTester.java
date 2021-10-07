package com.pack.oops;

class Phone{
	protected void battery(){
		System.out.println("2000 mh");
	}
}

public class ProtectedTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phn=new Phone();
		phn.battery();
	}

}
