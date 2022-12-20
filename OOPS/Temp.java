package com.Alpha.OOPS;

public class Temp {

    public static void main(String[] args) {
        int number = 1;
        for (int line = 0; line < 5; line++) {
            for (int element = 1; element < line ; element++) {
                System.out.print(number++);
            }
            System.out.println();
        }
    }
}

