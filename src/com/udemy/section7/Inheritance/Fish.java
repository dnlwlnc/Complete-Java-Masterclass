package com.udemy.section7.Inheritance;

/**
 * Created by welencd on 2017-05-31.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, int weight, String name, int gills, int eyes, int fins) {
        super(brain, 1, 1, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }
}
