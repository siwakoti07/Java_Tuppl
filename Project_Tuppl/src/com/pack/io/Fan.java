package com.pack.io;

import java.io.Serializable;

public class Fan implements Serializable {

	private int price;
	private String name;
	
	public Fan() {
		
	}
	
	public Fan(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fan [price=" + price + ", name=" + name + "]";
	}
	
}
