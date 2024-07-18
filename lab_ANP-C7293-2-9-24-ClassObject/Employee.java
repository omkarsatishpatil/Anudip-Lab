//Write a Java program to create a class called "Employee" with a name, job title, and 
//salary attributes, and methods to calculate and update salary.

package com.javacore.demo;  // Package declaration

import java.util.Scanner;    // Importing the Scanner class for taking input from the user
// Creating the Employee class
public class Employee {
    // Declaring attributes for name, job title, and salary
    private String name;
    private String jobTitle;
    private double salary;

     // Constructor to initialize name, job title, and salary
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    // Getter and setter methods for name, job title, and salary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate the updated salary based on a percentage increase
    public void calculateUpdatedSalary(double increasePercentage) {
        this.salary += (this.salary * increasePercentage / 100);
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter the employee's name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();   // Reading the name input
        
         // Prompting the user to enter the employee's job title
        System.out.print("Enter employee job title: ");
        String jobTitle = scanner.nextLine();   // Reading the job title input
        
        // Prompting the user to enter the employee's salary
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();   // Reading the salary input

         // Creating an instance of the Employee class with the provided details
        Employee employee = new Employee(name, jobTitle, salary);
        
        // Printing the employee's details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        // Prompting the user to enter the percentage increase for salary
        System.out.print("Enter the percentage increase for salary: ");
        double increasePercentage = scanner.nextDouble();   // Reading the increase percentage
        
        // Calculating the updated salary
        employee.calculateUpdatedSalary(increasePercentage);
        // Printing the updated salary
        System.out.println("Updated Salary: " + employee.getSalary());

        // Closing the scanner object
        scanner.close();
    }
}

/*
Program starts and prompts the user to enter employee details.
User inputs name "John Doe", job title "Software Engineer", and salary 50000.
Employee object employee is created.
Program prints employee details.
Program prompts the user to enter the percentage increase for salary.
User inputs 10.
employee.calculateUpdatedSalary(10) updates the salary to 55000.
Program prints the updated salary.
Scanner object is closed.
*/
