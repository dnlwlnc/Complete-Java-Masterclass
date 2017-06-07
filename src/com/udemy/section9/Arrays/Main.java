package com.udemy.section9.Arrays;

import java.util.Scanner;

/**
 * Created by welencd on 2017-06-07.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myIntArray = new int[5];
        for(int i=0; i<myIntArray.length; i++) { // length to nie petoda tylko właściwość (property)
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

        /////////////////////////////////////////

        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);

        System.out.println("The average is: " + getAvg(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAvg(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }


    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
