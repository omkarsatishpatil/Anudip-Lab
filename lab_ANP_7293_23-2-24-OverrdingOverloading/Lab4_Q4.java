//Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
//Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in 
// each subclass to impose different withdrawal limits and fees.
package com.javacore.demo;

class BankAccount{
	public void deposit() {
		System.out.println("You can deposit money in BankAccount");
	}
	public void withdraw() {
		System.out.println("You can withdraw money from BankAccount");
	}
}
class SavingsAccount extends BankAccount{
	public void withdraw() {
		System.out.println("\nWithdrawal limit of savings account is 20k per day with 5rs charges");
	}
	
}
class CheckingAccount extends BankAccount{
	public void withdraw() {
		System.out.println("\nWithdrawal limit of checking account is 30k per day with 15rs charges");
	}
	
}
public class Lab4_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		ba.deposit();
		ba.withdraw();
		
		BankAccount sa=new SavingsAccount();
		sa.withdraw();
		
		BankAccount ca=new CheckingAccount();
		ca.withdraw();
		
	}

}
