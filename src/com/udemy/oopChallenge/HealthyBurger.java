package com.udemy.oopChallenge;

/**
 * Created by welencd on 2017-06-02.
 */
public class HealthyBurger extends Hamburger {

    private String healthyAddition1;
    private double healthyAdditionPrice1;

    private String healthyAddition2;
    private double healthyAdditionPrice2;

    public HealthyBurger(double price, String meat) {
        super("Healthy berger", price, meat, "buła razowa");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1 = name;
        this.healthyAdditionPrice1 = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2 = name;
        this.healthyAdditionPrice2 = price;
    }

    @Override
    public double getTotalPrice() {
        double hamburgerPrice = super.getTotalPrice();

        if(healthyAddition1 != null) {
            hamburgerPrice += this.healthyAdditionPrice1;
            System.out.println(this.healthyAddition1 + " added for: " + this.healthyAdditionPrice1);
        }

        if (healthyAddition2 != null) {
            hamburgerPrice += this.healthyAdditionPrice2;
            System.out.println(this.healthyAddition1 + " added for: " + this.healthyAdditionPrice1);
        }

        return hamburgerPrice;
    }
}
