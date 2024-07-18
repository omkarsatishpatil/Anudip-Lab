// Write a Java program to display the cube of the given number up to an integer.

package com.javacore.demo;
import java.util.*;

public class Cube {
	public void cube(int n) 
	{
		int cube= n*n*n;
		System.out.println("CUBE OF " + n   +  " is "  + cube);
	}
	
	public static void main(String args[])
	
	{
		Cube d =new Cube();
		
	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER A NUMBER");
	
	int i =sc.nextInt();
	for(int a =1;a<=i;a++)
	{
		d.cube(a);
		
	}
}
}