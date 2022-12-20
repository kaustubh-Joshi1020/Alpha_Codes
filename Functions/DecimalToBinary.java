package com.Alpha.Functions;

public class DecimalToBinary {
    public static void decimaltobinary(int num){
        int binary = 0;
        int pow = 0;
            while (num > 0){
            int rem = num % 2;
            binary = binary + (rem * (int)Math.pow(10 , pow));
            pow++;
            num = num / 2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        decimaltobinary(5);
    }

}
