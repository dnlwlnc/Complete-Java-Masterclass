package com.udemy.section6;

/**
 * Created by welencd on 2017-05-09.
 */
public class ForStatement {
	public static void main(String[] args) {
/*        System.out.println(calculateInterest(10000,2));
		System.out.println(calculateInterest(10000, 3));
		System.out.println(calculateInterest(10000, 4));*/

        //ZADANIA//
/*        for (double i = 2; i < 9; i++) {
            System.out.println("Interest rate for " + i + " % is: " + calculateInterest(10000, i));
        }

        for (double i = 8; i > 1; i--) {
            System.out.println("Interest rate for " + i + " % is: " + calculateInterest(10000, i));
        }*/

        int i=0;

        for(int n=1; n < 101; n++) {

            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
                i += 1;
            }

            if (i == 3) {
                System.out.println("Mamy już 3 liczby pierwsze.");
                break;
            }
        }

    }

    // LICZBY PIERWSZE //

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

	public static double calculateInterest(double amount, double interestRate){
		return (amount * interestRate / 100);
	}
}
