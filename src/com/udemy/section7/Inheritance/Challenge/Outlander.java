package com.udemy.section7.Inheritance.Challenge;

/**
 * Created by welencd on 2017-05-31.
 */
public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }


}
