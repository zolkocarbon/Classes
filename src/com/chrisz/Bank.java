package com.chrisz;

public class Bank {
    private double balance;
    private int accountNumber;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    // balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    // account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    // customer Name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    // customer Email
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    // customer phone
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    // deposit
    public double deposit(double depositValue) {
        this.balance += depositValue;
        return this.balance;
    }

    // withdraw
    public double withdraw(double withdrawValue) {
        if(this.balance > withdrawValue) {
            this.balance -= withdrawValue;
            return this.balance;
        } else {
            return -1; // how do I return a String for insufficient funds?
        }
    }
}
