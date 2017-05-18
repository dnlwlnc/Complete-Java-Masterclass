package com.udemy.section7.Classes;

/**
 * Created by welencd on 2017-05-17.
 */

public class Car {
    // public - unrestricted access to the class
    // private - restricted access
    // protected - available only in the package

    // FIELDS:
        // private -> encapsulation
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // CONSTRUCTOR

    public void setModel(String model){
        this.model = model; // this. odnosi się do pola w klasie
    }

    public String getModel(){
        return this.model;
    }
}
