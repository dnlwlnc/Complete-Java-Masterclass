package com.udemy.section9.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by welencd on 2017-06-26.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Warszawa");
        placesToVisit.add("Berlin");
        placesToVisit.add("Paryz");
        placesToVisit.add("Londyn");
        placesToVisit.add("Madryt");
        placesToVisit.add("Lizbona");
        placesToVisit.add("Rzym");
        printList(placesToVisit);

        placesToVisit.add(1, "Dublin");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("===================================");
    }

    private static boolean addInOrder (LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); // tutaj dopiero przechodzimy do pierwszego rekordu
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already on the list.");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one; Gdynia przed Warszawą
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to the next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

}
