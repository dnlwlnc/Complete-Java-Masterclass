package com.udemy.section6;

/**
 * Created by welencd on 2017-05-09.
 */
public class Switch {
    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4:case 5:case 6:
                System.out.println("Value is 4, 5 or 6");
                break;
            default:
                System.out.println("Value is unknown");
                break; // można pominąć, ale lepiej zostawić
        }

        // ZADANIE //

        char switchar = 'A';

        switch (switchar) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println(switchar + " was found.");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }

    }
}
