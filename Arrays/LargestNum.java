package com.Alpha.Arrays;

public class LargestNum {
    public static int largestnumber(int num[]){
        int largest = Integer.MIN_VALUE; // this is internal function of java.util
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i] ){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {6,3,4,1,7,9,2};
        int large = largestnumber(num);
        System.out.println("largest number is : "+ large);
    }
}
