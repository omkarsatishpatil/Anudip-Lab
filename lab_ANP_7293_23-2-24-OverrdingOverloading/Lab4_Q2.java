//Write a Java program to create a base class Sports with a method called play().
//Create three subclasses: Football, Basketball, and Rugby. Override the play() method in
//each subclass to play a specific statement for each sport.
package com.javacore.demo;

class Sports{
	public void play() {
		System.out.println("There are many sports:");
	}
}
class Football extends Sports{
	public void play() {
		System.out.println("\nFootball team has 11 players ");
	}
}
class Basketball extends Sports{
	public void play() {
		System.out.println("Basketball team has 5 players");
	}
}
class Rugby extends Sports{
	public void play() {
		System.out.println("Rugby team has 15 players");
	}
}
public class Lab4_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sp=new Sports();
		sp.play();
		
		Sports fb=new Football();
		fb.play();
		
		Sports bk=new Basketball();
		bk.play();
		
		Sports rb=new Rugby();
		rb.play();

	}

}
