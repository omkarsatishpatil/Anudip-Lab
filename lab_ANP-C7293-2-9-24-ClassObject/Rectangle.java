//Write a Java program to create a class called "Rectangle" with width and 
//height attributes. Calculate the area and perimeter of the rectangle.

package com.javacore.demo;
//importing the scanner class for taking input from user
import java.util.Scanner;
//Creating the rectangle class
public class Rectangle {
	//initiating the variable area ana perimeter
	int area;
	int perimeter;
	
	//creating method area with parameters length and width
	public int area(int length,int width ) {
		area=length*width;
		return area;
	}
	//creating method perimter with parameters length and width
	public int perimeter(int length,int width) {
		perimeter=2*(length+width);
		return perimeter;
	}

	public static void main(String[] args) {
	    //scanner is taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width");
		int length=sc.nextInt(); //value saved in length variable
		int width=sc.nextInt(); //value saved in width variable
		//creating the object of the reactangle
		Rectangle r = new Rectangle();
		
		System.out.println("Area of Rectangle is " +r.area(length, width));
		System.out.println("Perimeter of Rectangle is " +r.perimeter(length, width));
		
	}

}

/*
Dry Run Test
Program starts with main method prompts user for input.
User inputs length 5 and width 3.
Rectangle object r is created.
r.area(5, 3) calculates and returns 15.
Program prints "Area of Rectangle is 15".
r.perimeter(5, 3) calculates and returns 16.
Program prints "Perimeter of Rectangle is 16".
*/
