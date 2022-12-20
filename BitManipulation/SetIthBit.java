package com.Alpha.BitManipulation;

public class SetIthBit {
    public static int setbit(int num , int ithbit){ // set bit means convert the ith bit into one
        int bitmask = 1 << ithbit;
        return num | bitmask; // oring can convert the zero to the one ... refer or table
//        System.out.println(Integer.toBinaryString(ans));
    }

    public static void main(String[] args) {
//        System.out.println(setbit(5, 1));
        setbit(5, 3);
    }
}
