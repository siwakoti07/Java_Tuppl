package org.pack.spring.bean;

import java.util.List;

public class Rectangle {

	private List<Point> listOfPoints;

	public List<Point> getListOfPoints() {
		return listOfPoints;
	}

	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}

	@Override
	public String toString() {
		return "Rectangle [listOfPoints=" + listOfPoints + "]";
	} 
	
}
