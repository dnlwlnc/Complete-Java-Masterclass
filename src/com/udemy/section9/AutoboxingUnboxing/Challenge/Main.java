package com.udemy.section9.AutoboxingUnboxing.Challenge;

/**
 * Created by welencd on 2017-06-26.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("PKO");
        if (bank.addBranch("Warszawa")) {
            System.out.println("Branch created.");
        }

        bank.addCustomer("Warszawa", "Jan", 50.0);
        bank.addCustomer("Warszawa", "Adam", 500.1);
        bank.addCustomer("Warszawa", "Andrzej", 100.25);

        bank.addBranch("Krakow");
        bank.addCustomer("Krakow", "Janusz", 120.53);

        bank.listCustomers("Warszawa", true);
        bank.listCustomers("Krakow", false);

        bank.addBranch("Gdansk");

    }
}
