package com.pack.oops;

class Pen{

	public void brandName() {
		System.out.println("Reynolds");
	}
	public void brandName(String brandname) {
		System.out.println(brandname);
	}
	public void brandName(int price) {
		System.out.println(price);
	}
	
}
public class MethodOverloadingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1=new Pen();
		pen1.brandName();
		pen1.brandName("Jhakkas");
		pen1.brandName(9);
	}

}
