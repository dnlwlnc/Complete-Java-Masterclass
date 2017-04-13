package com.udemy.section5;

/**
 * Created by welencd on 2017-04-13.
 */
public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver == true) { // if może wyglądać tak: if(gameOver), true to warunek domyślny
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is: " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

/*      jeśli metoda ma zwracać jakąś wartość WARUNKOWO, trzeba zadbać o to,
        że wszystkie scenariusze zostaną wykonane,
        tzn. w tym wypadku dodać warunek else*/
    }

}
