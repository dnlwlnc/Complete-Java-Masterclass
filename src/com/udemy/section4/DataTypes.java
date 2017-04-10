package com.udemy.section4;

/**
 * Created by welencd on 2017-04-10.
 */
public class DataTypes {
    public static void main(String[] args){

        // zapisuje wartość na 32 bitach
        int intMinValue = -2_147_483_648;
        int intMaxValue = 2_147_483_647;
        int myTotal = (intMinValue / 2);

        // zapisuje wartość na 8 bitach
        byte byteMinValue = -128;
        byte myteMaxValue = 127;
        byte myByteValue = (byte) (byteMinValue / 2); // casting jest potrzebny, ponieważ 2 to domyślnie INT

        // zapisuje wartość na 16 bitach
        short shortMinValue = -32768;
        short shortMaxValue = 32767;
        short myShortValue = (short) (shortMinValue / 2);

        // zapisuje na 64 bitach
        long longMinValue = -9_223_372_036_854_775_808L; // trzeba dodawać L na końcu
        long longMaxValue = 9_223_372_036_854_775_807L;

        // ------------------ ZADANIE

        byte exByte = 10;
        short exShort = 10;
        int exInt = 10;
        long exLong = 5000 + 10 * (exByte + exShort + exInt); // long nie potrzebuje (cast) ponieważ akceptuje inty,a inne typy danych są tutaj konwertowalne na int właśnie

        System.out.println(exLong);
    }
}
