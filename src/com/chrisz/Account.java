package com.chrisz;

// Challenge 1
public class Account {
    private String name;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Don't call other methods in the constructor, like this.setNumber, because
    // it may not always work
    public Account() {
        this("Default name", 0.0); // default constructor values
        System.out.println("Empty constructor called");
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name) {
        this(name, 0.00);
        this.name = name;
    }
    // ****** Click code -> generate -> getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(this.balance >= withdrawAmount) {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed. New balance is " + this.balance);
        } else {
            System.out.println("Only " + this.balance + "available. Withdraw not processed.");
        }
    }
}
