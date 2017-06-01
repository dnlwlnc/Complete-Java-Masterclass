package com.udemy.section7.Inheritance.Challenge;

/**
 * Created by welencd on 2017-06-01.
 */
public class Main {
    public static void main(String[] args){
        Outlander outlander = new Outlander(24);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-45);

    }
}
