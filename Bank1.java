package com.javacore.java;

 abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

	public void cal_Interest() {
		// TODO Auto-generated method stub
		
	}
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal. Transaction exceeds overdraft limit.");
        }
    }
}

public class Bank1{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        currentAccount.deposit(100);
        currentAccount.withdraw(800);

        System.out.println("Savings account balance: RS." + savingsAccount.getBalance());
        System.out.println("Current account balance: RS." + currentAccount.getBalance());
    }
}
