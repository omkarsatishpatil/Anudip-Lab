//Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.

package com.javacore.demo;
class Animal{
	public void move() {
		System.out.println("Animal");
	}
}
class Cheetah extends Animal{
	public void move() {
		System.out.println("Cheetah moves very fast");
	}
}

public class Lab3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah ch=new Cheetah();
		ch.move();

	}

}
