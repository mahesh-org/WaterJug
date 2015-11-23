package com.puzzle.waterjug.util;

public class Gcd {

    private Gcd() {
    }

    public static int of(int x, int y) {
        int gcd = 0;
        int greaterNumber, smallerNumber;

        greaterNumber = (x > y) ? x : y;
        smallerNumber = (x < y) ? x : y;

        gcd = smallerNumber;

        while (greaterNumber % smallerNumber != 0) {
            gcd = greaterNumber % smallerNumber;
            greaterNumber = smallerNumber;
            smallerNumber = gcd;
        }

        return gcd;

    }

}
