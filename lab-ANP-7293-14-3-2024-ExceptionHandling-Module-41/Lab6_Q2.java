//Write a program for voting Application, take the user’s age as input and explicitly
//throw the exception if the user’s age is less than 18 to terminate the program.

package com.javacore.demo;

public class Lab6_Q2 {
	
	void validate(int age) throws ArithmeticException
	{
		
		if(age<18)
		throw new ArithmeticException ("age is not valid"); //throw instance of class(ArithmeticException)
		else
			System.out.println("You are eligible for voting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab6_Q2 td = new Lab6_Q2();
		try
		{
			td.validate(23);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for Voting");
		}
		//System.out.println("It will be executed");
		

	}

}
