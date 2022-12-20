package com.Alpha.Arrays;

public class PrintingSubarray {
    public static void subarray(int num[]){
        for (int i = 0; i < num.length; i++) {
            int first = i;
            for (int j = i; j < num.length ; j++) {
                int last = j;
                int sum = 0;
                for (int k = first; k <=last ; k++) {
                    System.out.print(num[k]);
                    sum = sum + num[k];
                }
                System.out.print("=" + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subarray(num);
    }
}
