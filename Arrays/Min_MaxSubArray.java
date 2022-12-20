package com.Alpha.Arrays;

public class Min_MaxSubArray {
    public static void subarray(int num[]){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int first = i;
            for (int j = i; j < num.length ; j++) {
                int last = j;
                int sum = 0;
                for (int k = first; k <=last ; k++) {
//                    System.out.print(num[k]);
                    sum = sum + num[k];
                }
                System.out.print(sum);
                if(max_sum < sum){
                    max_sum = sum;
                }
                System.out.println();
            }

//            System.out.println();
        }
        System.out.println("the max sum is: "+max_sum);
    }

    public static void main(String[] args) {
        int num[] = {1, -2 , 6 ,-1 ,3};
        subarray(num);
    }
}


