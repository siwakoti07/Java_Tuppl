package com.pack.oops;

interface Shape {

	public void draw();

}
class Triangle implements Shape{
	public void draw() {
		System.out.println("Triangle drawn!!!");
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Circle drawn!!!");
	}
}
public class InterfaceTester{
	public static void main(String[] args) {
		Triangle triangle=new Triangle();
		Circle circle=new Circle();
		triangle.draw();
		circle.draw();
	}
}