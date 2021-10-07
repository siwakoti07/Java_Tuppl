package com.pack.oops;

class College {
	public void location() {
		System.out.println("location of the college");
	}
	public static void name() {
		System.out.println("name of the college");
	}
	public void rank() {
		System.out.println("rank of the college");
		name();
	}
	public static void fee() {
		System.out.println("fee of the college");
		//location();
		name();
	}
}

public class Tester {
	public static void main(String[] args) {
		College college = new College();
		college.location();
		College.name();
		System.out.println("----------------------------");
		college.rank();
	}
}
