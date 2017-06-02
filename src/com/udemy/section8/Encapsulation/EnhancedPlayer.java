package com.udemy.section8.Encapsulation;

/**
 * Created by welencd on 2017-06-02.
 */
public class EnhancedPlayer {
    private String name;
    private int zdrowie = 100;
    private String weapon;

    public EnhancedPlayer(String name, int zdrowie, String weapon) {
        this.name = name;
        if (zdrowie > 0 && zdrowie <= 100) {
            this.zdrowie = zdrowie;
        } // prosta walidacja
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.zdrowie = this.zdrowie - damage;
        if (this.zdrowie <= 0) {
            System.out.println("Player is dead. Game over.");
        }
    }

    public int getZdrowie() {
        return zdrowie;
    }
}
