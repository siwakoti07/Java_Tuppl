package com.pack.oops;

class Employee{
	private int eid;
	private String ename;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
public class EncapsulationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEid(101);
		employee.setEname("John");
		
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
	}

}
