package com.company;

public class BankAccount {
    private  int id;
    private static int counter = 1;
    private static double interestRate = 0.02;
    private double balance;

    public BankAccount() {
        this.id = counter++;
        System.out.printf("Account ID%d created\n",this.id);
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }


    public  double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }
}
