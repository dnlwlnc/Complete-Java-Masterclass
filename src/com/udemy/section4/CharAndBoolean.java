package com.udemy.section4;

public class CharAndBoolean {
    public static void main(String[] args){
        char myChar = '\u00A9'; // u konieczne jeśli wpisujemy namiary na znak unicode
        System.out.println(myChar);

        boolean isBoolean = true;

        // Challenge; print a "registered" symbol

        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }
}
