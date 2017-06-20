package com.udemy.section9.ArrayList.Challenge;

/**
 * Created by welencd on 2017-06-20.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }


    // GETTERS; nie potrzeba setterów, będziemy używać konstruktora

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
