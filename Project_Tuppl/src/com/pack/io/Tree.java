package com.pack.io;

import java.io.Serializable;

public class Tree implements Serializable {

	private static final long serialVersionUID = 1L;

	transient private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Tree(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Tree() {
	}

	@Override
	public String toString() {
		return "Tree [age=" + age + ", name=" + name + "]";
	}

}