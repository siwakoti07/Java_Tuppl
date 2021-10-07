package org.pack.bean;

public class Car {

	private String name;
	private String model;
	private int price;
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
