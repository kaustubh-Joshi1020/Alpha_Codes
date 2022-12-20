package com.Alpha.BitManipulation;

public class CountSetBits {
    public static void countsetbits(int num){
        int count = 0;
        while (num > 0){
            if ((num & 1) != 0){ // also (num & 1) == 2 this can be used, anding will return if the last digit is 1 then 1 either ot will give 0.
                count++;
            }
          num = num >>1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countsetbits(15);
    }
}
