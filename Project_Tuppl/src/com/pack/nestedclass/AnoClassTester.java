package com.pack.nestedclass;

interface Forest{
	public void treeType();
}
class Tree implements Forest{
	public void treeType() {
		System.out.println("This is Forest type.");
	}
	
	public void treeName() {
		System.out.println("This is Neem tree.");
	}
}


public class AnoClassTester {

	public static void main(String[] args) {
		Tree tree =  new Tree();
		tree.treeType();
		
		Forest forest = new Tree();
		forest.treeType();
		//forest.treeName();
		
		Forest forest2 = new Forest() {

			@Override
			public void treeType() {
				System.out.println("This is treetype from anonymous class.");
				
			}
		};
		forest2.treeType();
		
		Forest forest3 = new Forest() {

			@Override
			public void treeType() {
				System.out.println("This is second treetype from ano class.");
				
			}
			
		};
		forest3.treeType();

	}
}
