package com.udemy.section5;

public class MethodOverloading {
    public static void main(String[] args) {
/*        int newScore = calculateScore("Daniel", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(300);
        calculateScore();*/

        System.out.println(calcFeetAndInchesToCentimeters(7, 1));

        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + "scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player and unknown score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches are equal to " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remaining = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remaining);
        return calcFeetAndInchesToCentimeters(feet, remaining);

    }



}
