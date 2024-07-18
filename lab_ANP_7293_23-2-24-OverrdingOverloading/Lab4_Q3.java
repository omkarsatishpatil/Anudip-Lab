//Write a Java program to create a base class Shape with methods draw() and calculateArea().
//Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each
//subclass to draw the respective shape, and override the calculateArea() method to calculate 
//and return the area of each shape.
package com.javacore.demo;

class Shape12{
	int r=2;
	int b=3;
	double area;
	public void draw() {
		System.out.println("Following are the various shapes:");
	}
	public double calculateArea() {
		System.out.println("Calculating the areas:");
		return area;
	}
}
class Circle12 extends Shape12{
	public void draw() {
		System.out.println("\nDrawing a Circle");
	}
	public double calculateArea() {
		area=3.14*r*r;
		System.out.println("Area of circle is " + area);
		return area;
	}
}
class Square extends Shape12{
	public void draw() {
		System.out.println("\nDrawing a Square");
	}
	public double calculateArea() {
		area=r*r;
		System.out.println("Area of square is " + area);
		return area;
	}
}
class Triangle extends Shape12{
	public void draw() {
		System.out.println("\nDrawing a Triangle");
	}
	public double calculateArea() {
		area=0.5*r*b;
		System.out.println("Area of Triangle is " + area);
		return area;
	}
}
public class Lab4_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape12 sp=new Shape12();
		sp.draw();
		sp.calculateArea();
		
		Shape12 cr=new Circle12();
		cr.draw();
		cr.calculateArea();
		
		Shape12 sq=new Square();
		sq.draw();
		sq.calculateArea();
		
		Shape12 tr=new Triangle();
		tr.draw();
		tr.calculateArea();
	}

}
