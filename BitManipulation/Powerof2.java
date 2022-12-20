package com.Alpha.BitManipulation;

public class Powerof2 {
    public static void powerof2(int num){
        if ((num & num-1) == 0){
            System.out.println("it is power of 2");
        }
        else {
            System.out.println("not power of 2");
        }
    }

    public static void main(String[] args) {
        powerof2(16);
    }
}
