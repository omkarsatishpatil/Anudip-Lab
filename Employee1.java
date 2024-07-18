package com.javacore.java;

import java.util.Scanner;

abstract class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String department, double bonus) {
        super(name, department);
        this.bonus = bonus;
    }

    @Override
    
    public double calculateSalary() 
    {
        double baseSalary = 50000;
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee 
{
    private int experience;

    public Programmer(String name, String department, int experience) {
        super(name, department);
        this.experience = experience;
    }

    @Override
    public double calculateSalary() 
    {
        
        double baseSalary = 40000;
        double salaryPerYear = 2000;
        return baseSalary + (salaryPerYear * experience);
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();
        
        System.out.print("Enter manager department: ");
        String managerDepartment = scanner.nextLine();
        
        System.out.print("Enter manager bonus: ");
        double managerBonus = scanner.nextDouble();

        System.out.print("Enter programmer name: ");
        String programmerName = scanner.nextLine();
        
        System.out.print("Enter programmer department: ");
        String programmerDepartment = scanner.nextLine();
        
        System.out.print("Enter programmer experience (years): ");
        int programmerExperience = scanner.nextInt();

        

        Manager manager = new Manager(managerName, managerDepartment, managerBonus);
        Programmer programmer = new Programmer(programmerName, programmerDepartment, programmerExperience);

        manager.displayInfo();
        programmer.displayInfo();
    }
}
