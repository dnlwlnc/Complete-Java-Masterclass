package com.udemy.section7.Classes;

/**
 * Created by welencd on 2017-05-17.
 */
public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Porsche " + porsche.getModel());
    }
}
