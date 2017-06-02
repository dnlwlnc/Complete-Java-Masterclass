package com.udemy.section8.Encapsulation.Challenge.TimSolution;

/**
 * Created by welencd on 2017-06-02.
 */
public class Main {
    public static void main(String[] args){
        Printer drukarka = new Printer(50, false);

        System.out.println("Initial page count = " + drukarka.getPagesPrinted());
        int pagesPrinted = drukarka.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + drukarka.getPagesPrinted());
        pagesPrinted = drukarka.printPages(2);
        System.out.println("Pages printed " + pagesPrinted + " new total: " + drukarka.getPagesPrinted());
    }
}
