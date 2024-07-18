//Write a Java program to create a class called "Circle" with a radius attribute.
//You can access and modify this attribute. Calculate the area and circumference of 
//the circle.

package com.javacore.demo;

import java.util.Scanner;

// Circle class with methods to calculate area and circumference
public class Circle {
    
    // Attributes to store the area and circumference
	float area;
	double circumference;
	
	// Method to calculate the area of the circle
	public float area(int r) {
		area=(float) (3.14*(r*r));  // Calculating area using the formula πr^2
		return area;
	}
	
	// Method to calculate the circumference of the circle
	public double circumference(int r) {
		circumference=2*3.14*r; // Calculating circumference using the formula 2πr
		return circumference;
	}

	public static void main(String[] args) {
		// Creating Scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		// Prompting user to enter the radius
		System.out.println("Enter the value of radius");
		int r=sc.nextInt(); // Reading radius value
		
		// Creating an instance of Circle class
		Circle cr=new Circle();
		
		// Calculating and displaying area of the circle
		System.out.println("Area of circle is " +cr.area(r));
		
		 // Calculating and displaying circumference of the circle
		System.out.println("Circumference of circle is " +cr.circumference(r));
	}

}

/*
Dry Run
Program starts and prompts user for input.
User inputs radius 5.
Circle object cr is created.
cr.area(5) calculates and returns 78.5.
Program prints "Area of circle is 78.5".
cr.circumference(5) calculates and returns 31.4.
Program prints "Circumference of circle is 31.4".
*/




