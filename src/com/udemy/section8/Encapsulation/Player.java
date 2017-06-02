package com.udemy.section8.Encapsulation;

/**
 * Created by welencd on 2017-06-02.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player is dead.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
