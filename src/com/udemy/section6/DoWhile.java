package com.udemy.section6;

/**
 * Created by welencd on 2017-05-09.
 */
public class DoWhile {
    public static void main(String[] args) {
/*        int count = 1;

        while (count !=6){
            System.out.println("Count is: " + count);
            count++;
        }

        count=1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }

        count=1;
        do {
            System.out.println("Count value was: " + count);
            count++;
        } while (count != 6);
*/
        int number = 5;
        int finishNumber = 20;
        int evenNumbers = 0;
        while (number <= finishNumber){
            while (evenNumbers < 5) {
                if (!isEvenNumber(number)) {
                    number++;
                    continue;
                }
                evenNumbers++;
                System.out.println("Even number: " + number + " and there are " + evenNumbers + " even numbers");
                number++;
            }
        }


    }


    // ZADANIE //

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

}
