//Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.
package lab.com;

import java.util.Scanner;

class BankAccount 
{
    private int balance;
    public BankAccount(int initialBalance) 
    {
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount)
    {
        System.out.println("Depositing: " + amount);
        balance = balance + amount;
        System.out.println("New balance after deposit: " + balance);
    }
    public synchronized void withdraw(int amount)
    {
        if (balance >= amount) 
        {
            System.out.println("Withdrawing: " + amount);
            balance = balance - amount;
            System.out.println("New balance after withdrawal: " + balance);
        }
        else 
        {
            System.out.println("Insufficient funds for withdrawal");
        }
    }
    public int getBalance()
    {
        return balance;
    }
}

class Deposit implements Runnable
{
    private BankAccount account;
    private int amount;
    public Deposit(BankAccount account, int amount) 
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() 
    {
        account.deposit(amount);
    }
}

class Withdraw implements Runnable 
{
    private BankAccount account;
    private int amount;
    public Withdraw(BankAccount account, int amount) 
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.withdraw(amount);
    }
}

public class BankApplicarion
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount(1000);
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        int depositAmount = xyz.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = xyz.nextInt();

        Thread depositThread = new Thread(new Deposit(account, depositAmount));
        Thread withdrawThread = new Thread(new Withdraw(account, withdrawalAmount));

        depositThread.start();
        withdrawThread.start();

	}

}
