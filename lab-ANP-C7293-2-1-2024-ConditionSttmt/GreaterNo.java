//Write a Java program that takes three numbers from the user and 
//prints the greatest number.

package com.javacore.demo;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is greater number");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater number");
		}
		else {
			System.out.println("C is greater");
		}

	}

}
