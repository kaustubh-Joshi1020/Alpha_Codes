package com.Alpha.BitManipulation;

public class GetIthBIt {
    public static int getbit(int num , int ithbit){
        int bitmask = 1<<ithbit ;   // here the 1 goes till the ith bit of our number
        int ans = num & bitmask;
        if (ans == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getbit(5, 2));
    }
}
