package com.javacore.java;

abstract class Shape {
     abstract double calculateArea();
     abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

     Circle(double radius) {
        this.radius = radius;
    }

    @Override
     double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
     double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

     Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
     double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
     double calculatePerimeter() {
       
        double hypo =base+height;
        return base + height + hypo;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}