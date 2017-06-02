package com.udemy.oopChallenge;

/**
 * Created by welencd on 2017-06-02.
 */
public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;


    public Hamburger(String name, double price, String meat, String breadType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadType = breadType;
    }

    public void addAddition1(String name, double price){
        this.additionName1 =name;
        this.additionPrice1=price;
        //System.out.println("Added " + name + " for: " + price + " PLN.");
    }

    public void addAddition2(String name, double price){
        this.additionName2 =name;
        this.additionPrice2=price;
        //System.out.println("Added " + name + " for: " + price + " PLN.");
    }

    public void addAddition3(String name, double price){
        this.additionName3 =name;
        this.additionPrice3=price;
        //System.out.println("Added " + name + " for: " + price + " PLN.");
    }

    public void addAddition4(String name, double price){
        this.additionName4 =name;
        this.additionPrice4=price;
        //System.out.println("Added " + name + " for: " + price + " PLN.");
    }

    public double getTotalPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " burger on "
                + this.breadType + " with "
                + this.meat + ". The price is: "
                + this.price);
        if(this.additionName1 != null){
            hamburgerPrice += this.additionPrice1;
            System.out.println(this.additionName1 + " added for: " + this.additionPrice1 + " PLN.");
        }
        if(this.additionName2 != null){
            hamburgerPrice += this.additionPrice2;
            System.out.println(this.additionName2 + " added for: " + this.additionPrice2 + " PLN.");
        }
        if(this.additionName3 != null){
            hamburgerPrice += this.additionPrice3;
            System.out.println(this.additionName3 + " added for: " + this.additionPrice3 + " PLN.");
        }
        if(this.additionName4 != null){
            hamburgerPrice += this.additionPrice4;
            System.out.println(this.additionName4 + " added for: " + this.additionPrice4 + " PLN.");
        }

        return hamburgerPrice;
    }
}
