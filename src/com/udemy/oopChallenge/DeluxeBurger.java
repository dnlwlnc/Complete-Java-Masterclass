package com.udemy.oopChallenge;

/**
 * Created by welencd on 2017-06-02.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Wypas", 20, "pulled pork", "bułka maślana");
        super.addAddition1("Frytki", 5.0);
        super.addAddition2("Cola", 2.5);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("No additional ingredients allowed.");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("No additional ingredients allowed.");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("No additional ingredients allowed.");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("No additional ingredients allowed.");
    }
}
