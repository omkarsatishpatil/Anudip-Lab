package com.javacore.java;


import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    void cal_Interest(); // For savings account only

    double getBalance();
}

class Svg_Acc implements Account {
    private double balance;
    private double interestRate;

    public Svg_Acc(double initialBalance, double interestRate) {
        this.balance = initialBalance;
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

    @Override
    public void cal_Interest() {
        balance += balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Cur_Acc implements Account {
    private double balance;
    private double overdraftLimit;

    public Cur_Acc(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
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

    @Override
    public void cal_Interest() {
        // Not applicable for current accounts
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

public class Bank2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new Svg_Acc(1000, 0.05));
        bank.addAccount(new Cur_Acc(500, 1000));

        // Simulate transactions
        bank.getAccounts().get(0).deposit(500);
        bank.getAccounts().get(0).withdraw(200);
        ((Svg_Acc) bank.getAccounts().get(0)).cal_Interest(); // Corrected casting to Svg_Acc

        bank.getAccounts().get(1).deposit(100);
        bank.getAccounts().get(1).withdraw(800);

        // Print account balances
        for (Account account : bank.getAccounts()) {
            System.out.println("Balance: $" + account.getBalance());
        }
    }
}
