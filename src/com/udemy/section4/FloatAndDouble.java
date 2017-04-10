package com.udemy.section4;

/**
 * Created by welencd on 2017-04-10.
 */
public class FloatAndDouble {
    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; // dobra praktyka to dawanie f na koncu, inaczej, trzeba (float)
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d; // domyślnie liczby ułamkowe to double; double są szybsze, funkcje wbudowane korzystają z double

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // --------------- ZADANIE; skonwertować pounds na kg
        double pounds = 200d;
        double kg = pounds*0.45359237d;
        System.out.println(pounds + " funtów to: " + kg + " kilogramów."); // = 90.718474

    }
}
