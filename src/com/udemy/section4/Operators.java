package com.udemy.section4;

public class Operators {
    public static void main(String[] args) {

        String tekst = "tekst";
        int a = 5;
        int b = 10;
        int minVal = a < 10 ? a : b;
        System.out.println(minVal);

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        // TASK
        ///////
        // 1. Create a double variable with the value 20
        // 2. Create a 2nd double var of type double with the value 80
        // 3. Add both numbers and multiply by 25
        // 4. Use the reminder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an 'if' statement that displays a msg 'Total was over the limit'
        // if remaining total (#4) is equal to 20 or less
        //

        double first = 20d;
        double second = 80d;
        double total = (first + second) * 25;
        double rest = total % 40;
        System.out.println("Total: " + total);
        System.out.println("Rest: " + rest);

        if (total % 40 <= 20) {
            System.out.println("Total was over the limit");
        }


    }
}
