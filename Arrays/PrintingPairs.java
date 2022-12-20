package com.Alpha.Arrays;

public class PrintingPairs {
    public static void pairs(int num[]){
        for (int i = 0; i < num.length; i++) {
            int current_num = num[i];
            for (int j = i+1; j < num.length ; j++) {
                System.out.print("(" + current_num + "," + num[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        pairs(num);
    }
}
