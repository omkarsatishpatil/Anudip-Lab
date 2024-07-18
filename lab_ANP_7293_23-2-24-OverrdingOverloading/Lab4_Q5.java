//Write a Java program to create a base class Shape with methods draw() and calculateArea().
//Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw 
//the respective shape. In addition, override the calculateArea() method in the Cylinder subclass
//to calculate and return the total surface area of the cylinder.

package com.javacore.demo;

class Shape13{
	double area;
	int r=2;
	int h=3;
	public void draw() {
		System.out.println("Following are the various shapes:");
	}
	public void calculateArea() {
		System.out.println("Calculating the areas:");
	}
}
class Circle13 extends Shape13{
	public void draw() {
		System.out.println("\nDrawing a circle");
	}
}
class Cylinder13 extends Shape13{
	public void draw() {
		System.out.println("\nDrawing a Cylinder");
	}
	public void calculateArea() {
		area=2*3.14*r*h+2*3.14*r*r;
		System.out.println("Surface area of Cylinder is " + area);
	}
}
public class Lab4_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape13 sp=new Shape13();
		sp.draw();
		sp.calculateArea();
		
		Shape13 cr=new Circle13();
		cr.draw();
		
		Shape13 cy=new Cylinder13();
		cy.draw();
		cy.calculateArea();

	}

}
