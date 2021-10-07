package org.pack.bean;

public class CarFactory {

	private String name;
	private String address;
	private Car car;
	private Employee employee;
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Car getCar() {
		return car;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "CarFactory [name=" + name + ", address=" + address + ", car=" + car + ", employee=" + employee + "]";
	}
	
	
}
