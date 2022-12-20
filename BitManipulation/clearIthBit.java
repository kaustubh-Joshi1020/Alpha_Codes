package com.Alpha.BitManipulation;

public class clearIthBit {
    public static int clearbit(int num , int ithbit){
        int bitmask = ~(1<<ithbit);
        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearbit(5, 2));

    }
}
