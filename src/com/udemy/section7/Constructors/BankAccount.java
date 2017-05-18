package com.udemy.section7.Constructors;

/**
 * Created by welencd on 2017-05-18.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // CONSTRUCTORs

    public BankAccount(){
        // wartości domyślne konstruktora
        this("0000", 0, "Default name", "Default address", "Default pho");
        System.out.println("Pusty konstruktor");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        System.out.println("Constructor with the parameters was called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    // METHODS


    public void deposit(double balance){
        this.balance += balance;
    }

    public void withdraw(double balance){
        if(balance > this.balance){
            System.out.println("You don't have " + this.balance + " PLN on your account.");
        }else {
            this.balance -= balance;
            System.out.println("Remaining balance: " + this.balance);
        }
    }



    // GETTERS AND SETTERS

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
