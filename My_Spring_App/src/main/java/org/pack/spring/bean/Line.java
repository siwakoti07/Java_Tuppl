package org.pack.spring.bean;

public class Line {

	private Point pointA;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	@Override
	public String toString() {
		return "Line [pointA=" + pointA + ", pointB=" + pointB + "]";
	}
	
	
}
