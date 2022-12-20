package com.Alpha.Functions;

public class BinaryToDecimal {
    public static void binarytodecimal(int num){
        int pow = 0;
        int decimal = 0;
        while (num > 0){
            int rem = num % 10;
            decimal = decimal + (int)(rem * Math.pow(2, pow));
            num = num/10;
            pow++;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        binarytodecimal(111);
    }
}

