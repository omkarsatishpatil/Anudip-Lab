//Write a Java program to create a class called Shape with a method called getArea(). Create a 
//subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package com.javacore.demo;

import java.util.Scanner;

class Shape{
	int area;
	public int getArea(int length,int width){
		return area;
		
	}
	
}
class Rectangle1 extends Shape{
	public int getArea(int length,int width) {
		area=length*width;
		return area;
		
	}
	
}

public class Lab3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width");
		int length=sc.nextInt();
		int width=sc.nextInt();
		
		Rectangle1 r = new Rectangle1();
		
		System.out.println("Area of Rectangle is " +r.getArea(length, width));

	}

}
