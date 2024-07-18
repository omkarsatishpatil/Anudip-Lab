//Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, 
//set their attributes using the constructor, and print their name and age.
//
package com.javacore.demo; //package name

//importing the scanner class for taking input from user
import java.util.Scanner;
//creating class name person
public class Person
{
    //declaring variables
	static String name;
	static int age;
	
	//creating the methods in class person
	public  String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args)
	{
	    // Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Prompting the user to enter the name
		System.out.println("Enter Name:");
		name = sc.nextLine();   // Reading the name input
		System.out.println("Enter Age:");
		age=sc.nextInt();
		
		// Creating an instance of the Person class
		Person p1 = new Person();
		// Printing the name and age of the person
		System.out.println("Name :"+p1.getName()+", Age : "+p1.getAge());
		
	}

}

/* 
Dry Run
Program starts and prompts user for input.
User inputs name "Alice".
User inputs age 30.
Person object p1 is created.
p1.getName() returns "Alice".
p1.getAge() returns 30.
Program prints "Name: Alice, Age: 30".
*/
