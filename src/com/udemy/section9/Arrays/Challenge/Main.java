package com.udemy.section9.Arrays.Challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by welencd on 2017-06-07.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(sortArray(myIntegers));
    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.\r");
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        for(int i=0;i<array.length/2;i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

//    public static int[] timSortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
//
//        boolean flag = true;
//        int temp;
//
//        while(flag){
//            flag = false;
//
//            for(int i=0; i<sortedArray.length-1; i++) {
//                if (sortedArray[i] < sortedArray[i + 1]) {
//                    temp=sortedArray[i];
//                    sortedArray[i] = sortedArray[i + 1];
//                    flag=true;
//                }
//            }
//        }
//        return sortedArray;
//    }

}
