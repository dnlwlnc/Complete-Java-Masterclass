package com.udemy.section7.Inheritance;

/**
 * Created by welencd on 2017-05-18.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5, 5, "Animal");
        Dog dog = new Dog(5, 5, "Yorke", 2, 4, 1, 20, "long sikly");
        //dog.eat();
        //dog.walk();
        dog.run();
    }
}
