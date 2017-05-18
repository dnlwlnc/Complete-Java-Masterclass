package com.udemy.section7.Constructors;

/**
 * Created by welencd on 2017-05-18.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount welenc = new BankAccount();

        //BankAccount welenc = new BankAccount("123456789", 0, "Daniel Welenc", "daniel@welenc.com", "+48600259634");

        System.out.println(welenc.getBalance());
        welenc.deposit(1250);
        System.out.println(welenc.getBalance());
        welenc.withdraw(250);
        System.out.println(welenc.getBalance());
        welenc.withdraw(5000);
        System.out.println(welenc.getBalance());
    }
}
