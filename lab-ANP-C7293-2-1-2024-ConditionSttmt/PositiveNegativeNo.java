//Write a Java program to get a number from the user and 
//print whether it is positive or negative

package com.javacore.demo;

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc=new Scanner(System.in);
		   
		    System.out.println("Enter a no");
		    int a = sc.nextInt();
		    
		    if(a>0) {
		    	System.out.println("Number is positive");
		    }
		    else if(a<0){
		    	System.out.println("Number is negative");
		    }
		    else {
		    	System.out.println("Number is zero");
		    }

	}

}
