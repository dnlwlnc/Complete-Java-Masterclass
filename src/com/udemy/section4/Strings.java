package com.udemy.section4;

/**
 * Created by welencd on 2017-04-10.
 */
public class Strings {
    public static void main(String[] args) {

        // String to klasa, a nie 'prymitive type'

        String myString = "To je napis";
        System.out.println("To je string\u00AE: " + myString);
        myString = myString + ", atoje więcej napisa.";
        myString = myString + " \u00A9 2017";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt; // konwertuje na String
        System.out.println(lastString);

    }
}
