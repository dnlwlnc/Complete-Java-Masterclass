package com.udemy.section8.Composition.Challenge;

/**
 * Created by welencd on 2017-06-01.
 */
public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling sufit = new Ceiling(250, 1);

        Bed bed = new Bed("Modern", 4, 200, 1, 2);
        Lamp lampa = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Sypialnia Daniela", wall1, wall2, wall3, wall4, sufit, bed, lampa);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
