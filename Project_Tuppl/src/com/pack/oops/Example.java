package com.pack.oops;

class Job {
	final int numOfJobs = 5;
	{
		System.out.println("Here is the non-static field of job class");
	}
	static {
		System.out.println("This is the static field in job class.");
	}
	public final void employer() {
		//numOfJobs=7;
		System.out.println("This function demonstrate the use of final in functions.");
	}
}
class Trainer extends Job{
	public Trainer() {
		super.employer();
	}
	public void print() {
		System.out.println("The number of jobs is: "+numOfJobs);
		//numOfJobs=6;
		System.out.println("The number of jobs is: "+numOfJobs);
	}
	//public void employer() {
		
	//}
}
public class Example {
	static {
		System.out.println("This is statement is static block.");
	}
	public static void main(String[] args) {
		Job j1 = new Job();
		Trainer t1 = new Trainer();
		t1.print();
		t1.employer();
		
	}
	static {
		System.out.println("This is from static block.");
	}

}
