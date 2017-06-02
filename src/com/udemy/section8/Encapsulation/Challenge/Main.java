package com.udemy.section8.Encapsulation.Challenge;

/**
 * Created by welencd on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
        Printer drukarka = new Printer(50, 50, false);

        System.out.println("Total pages printed " + drukarka.getTotalPagesPrinted());
        drukarka.printPage(50, false);
        drukarka.printPage(2, false);
        drukarka.tonerRefill();
        drukarka.printPage(2, false);
        System.out.println("Total pages printed " + drukarka.getTotalPagesPrinted());
    }
}
