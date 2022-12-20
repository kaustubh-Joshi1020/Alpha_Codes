package com.Alpha.BitManipulation;

public class OddOrEven {

    public static void oddeven(int num){
        int bitmask = num & 1;
        if (bitmask == 0){
            System.out.println("this is an even number");
        }
        else{
            System.out.println("this is an odd number");
        }
    }

    public static void main(String[] args) {
        int num = 29;
        oddeven(num);
    }
}
