package com.Alpha.Arrays;

import java.util.Arrays;

public class ReversingArray {
    public static void reversearr(int num[]){
        int start = 0 , end = num.length-1;
        while (start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        reversearr(num);

//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] +" ");
//        }

        System.out.println(Arrays.toString(num));

    }
}
