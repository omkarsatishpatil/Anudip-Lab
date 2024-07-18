//Write a Java program to create a method that reads a file and throws an exception 
//if the file is not found.


package com.javacore.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab6_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try 
		    {
		      readFile("intro.txt");
		    } 
		    catch (FileNotFoundException e) 
		    {
		      System.out.println("Error: " + e.getMessage());
		    }
		  }

		  public static void readFile(String fileName) throws FileNotFoundException {
		    File file = new File(fileName);
		    Scanner sc = new Scanner(file);

		    
		    while (sc.hasNextLine()) {
		      String line = sc.nextLine();
		      System.out.println(line);
		    }

	}

}
