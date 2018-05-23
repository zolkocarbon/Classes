package com.chrisz;

public class Main {

    public static void main(String[] args) {
	// ************* CLASSES AND OBJECTS ************
        Car porsche = new Car(); //initialize new object
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());


        // ******** Challenge 1 ********
        Account bob = new Account("bob", 2000);
        System.out.println(bob.getBalance());
        Account chris = new Account();
        System.out.println(chris.getName());
        chris.setName("Chris Zolko");
        chris.setBalance(2500);
        chris.deposit(51);
        System.out.println(chris.getName());

        Account tim = new Account("tim");
        System.out.println(tim.getBalance()); // default value assigned from method Account(name)

        // ********* Challenge 2 *********
        VipCustomer mike = new VipCustomer();
        System.out.println(mike.getName());
    }
}
