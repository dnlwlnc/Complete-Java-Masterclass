package com.udemy.section9.ArrayList.Challenge;

import java.util.ArrayList;

/**
 * Created by welencd on 2017-06-20.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println("This contact already exists");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if (findPosition < 0) {
            System.out.println(oldContact.getName() + " doesn't exist.");
            return false;
        }

        this.myContacts.set(findPosition, newContact);
        System.out.println(oldContact.getName() + " has been replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);

        if (findPosition < 0) {
            System.out.println(contact.getName() + " does not exist.");
            return false;
        }

        this.myContacts.remove(findPosition);
        System.out.println(contact.getName() + " has been removed.");
        return true;
    }

//    public String queryContact(Contact contact) {
//        if (findContact(contact) >= 0) {
//            return contact.getName();
//        }
//
//        return null;
//    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); // jeśli kontaktu nie ma, wartość będzie < 0
    }

    // Overload
    private int findContact(String contactName) {
        for(int i=0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact list");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber()
            );
        }
    }

}
