package com.udemy.section9.LinkedList;

import java.util.ArrayList;

/**
 * Created by welencd on 2017-06-26.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Daniel", 39.51);
        Customer anotherCustmer;
        anotherCustmer = customer; // nie tworzy nowej klasy/obiektu, tylko zapisuje adresy w pamięci dla customer
        anotherCustmer.setBalance(152.25);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        /////////////////////////////////

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // wartość zostanie umieszczona na liście, a pozostałe zostaną przesunięte "dalej"

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }


    }
}
