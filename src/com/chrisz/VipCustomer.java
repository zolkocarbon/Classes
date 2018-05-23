package com.chrisz;


// Challenge 2
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // this constructor will call the complete constructor when the word (this) is used
    public VipCustomer() {
        this("Default name", 0, "Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
