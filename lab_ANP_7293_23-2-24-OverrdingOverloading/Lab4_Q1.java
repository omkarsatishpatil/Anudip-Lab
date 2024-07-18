//Write a Java program to create a class Employee with a method called calculateSalary().
//Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() 
//method to calculate and return the salary based on their specific roles.
package com.javacore.demo;

class Employee11{
	
	public void calculateSalary() {
		
		System.out.println("Salary of Employee:");
	}
	
}
class Manager11 extends Employee11{
	
	public void calculateSalary() {
		
		System.out.println("\nSalary of Manager is 20LPA ");
}
}
class Programmer11 extends Employee11{
	public void calculateSalary() {
		
		System.out.println("Salary of Programmer 15LPA");
}
	
}

public class Lab4_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee11 em=new Employee11();
		em.calculateSalary();
		
		Employee11 mn=new Manager11();
		mn.calculateSalary();
		
		Employee11 pr=new Programmer11();
		pr.calculateSalary();

	}

}
