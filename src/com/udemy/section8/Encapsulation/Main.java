package com.udemy.section8.Encapsulation;

/**
 * Created by welencd on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Daniel";
//        //player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is: " + player.healthRemaining());
//
//        damage = 11;
//        player.health=300;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is: " + player.healthRemaining());

        // Enkapsulacja pozwala zachować kontrolę nad tym, co dzieje się z atrybutami danej klasy. Bez tego wszystkie
        // zmiany w klasie, muszą być implementowane w Main i z poziomu głównej klasy można zmieniać dowolonie
        // wartości atrybutów klasy


        EnhancedPlayer player = new EnhancedPlayer("Geralt", 180, "Two swords");
        System.out.println("Initial health is " + player.getZdrowie());
    }
}
