package com.udemy.section8.Composition.Challenge;

/**
 * Created by welencd on 2017-06-01.
 */
public class Bedroom {
    private String name;
    private Wall sciana1;
    private Wall sciana2;
    private Wall sciana3;
    private Wall sciana4;
    private Ceiling sufit;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall sciana1, Wall sciana2, Wall sciana3, Wall sciana4, Ceiling sufit, Bed bed, Lamp lamp) {
        this.name = name;
        this.sciana1 = sciana1;
        this.sciana2 = sciana2;
        this.sciana3 = sciana3;
        this.sciana4 = sciana4;
        this.sufit = sufit;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Making a bed");
        bed.make();
    }
}
