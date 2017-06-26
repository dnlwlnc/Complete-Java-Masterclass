package com.udemy.section9.AutoboxingUnboxing;

import java.util.ArrayList;

/**
 * Created by welencd on 2017-06-26.
 */

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(50));
        Integer integer = new Integer(50); // (*)
        Double doubleValue = new Double(12.12);

        // AUTOBOXING
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        // UNBOXING
        for(int i=0; i<=10; i++) {
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // krotsza wersja (*)
        int myInt = myIntValue; // ZADZIALA! myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            //myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            // double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i);
            System.out.println(i + " -> " + value);
        }

    }
}

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}