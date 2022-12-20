package com.Alpha.BitManipulation;

public class ClearBitsInRange {
    public static int clearbits(int num , int i , int j){
        i = (1<<i) - 1; /// by doing this step we adding 1's in last in our number
        j = (-1<<(j+1)); // by doing this step we adding
        int bitmask = i | j;
        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearbits(31, 2,4));
    }
}
