package com.udemy.section7.Constructors;

/**
 * Created by welencd on 2017-05-18.
 */
public class Vip {
    private String name;
    private double creditLimit;
    private String email;

    public Vip(){
        this("X Y", 0, "email@com");

    }

    public Vip(String name, String email){
        this(name, 0, email);
    }

    public Vip(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // GETTERS

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
