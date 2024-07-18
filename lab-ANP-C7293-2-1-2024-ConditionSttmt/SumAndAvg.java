//Write a program in Java to input 5 numbers from the keyboard
//and find their sum and average.

package com.javacore.demo;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		System.out.println("Sum of numbers = "+ (a+b+c+d+e));
		System.out.println("Avg. of numbers = "+ (a+b+c+d+e)/5);

	}

}
