package com.Alpha.BitManipulation;

public class ClearLastIbits {
    public static int clearbits(int n , int ithbit){
        int bitmask = ((-1 << ithbit)); // by leftshifting the -1 we get the 0's in last then by anding with
//                                      our number
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearbits(15 ,3 ));
//        System.out.println(Integer.toBinaryString(-1));
    }
}
