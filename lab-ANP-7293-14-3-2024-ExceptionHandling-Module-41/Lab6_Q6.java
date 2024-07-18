//Write a Java program that asks the user to enter an integer. Handle the InputMismatchException 
//that may occur if the user enters something that is not an integer.

package com.javacore.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab6_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Integer:");
		try
		{
			int n1 = sc.nextInt();
			System.out.println("Entered Value:"+n1);
		} 
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input.Please Enter an Integer");
		}

	}

}
