package com.udemy.section5;

/**
 * Created by welencd on 2017-04-13.
 */
public class Methods {

    public static void main(String[] args) {

        //calculateScore(true, 800, 5, 100);
        //calculateScore(true, 10000, 8, 200);

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        displayHighScorePosition("Daniel", calculateHighScorePosition(1500));
        displayHighScorePosition("Paulina", calculateHighScorePosition(900));
        displayHighScorePosition("Kamil", calculateHighScorePosition(400));
        displayHighScorePosition("Maciej", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver == true) { // if może wyglądać tak: if(gameOver), true to warunek domyślny
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            //System.out.println("Final score is: " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

/*      jeśli metoda ma zwracać jakąś wartość WARUNKOWO, trzeba zadbać o to,
        że wszystkie scenariusze zostaną wykonane,
        tzn. w tym wypadku dodać warunek else*/
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managet to get into position: " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}
