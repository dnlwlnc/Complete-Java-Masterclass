package com.udemy.section5;


public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) { // if może wyglądać tak: if(gameOver), true to warunek domyślny
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score is: " + finalScore);
        }
        // int savedFinalScore = finalScore; // zwróci błąd, bo finalScore jest niedostępna poza blokiem kodu

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("2nd score is: " + secondScore);
        }

    }
}
