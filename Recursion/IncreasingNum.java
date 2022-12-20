package com.Alpha.Recursion;

import java.util.jar.JarOutputStream;

public class IncreasingNum {
    public static void IncreaseNum(int num ){
        if (num == 1){
            System.out.print("1 ");
            return;
        }
        IncreaseNum(num -1);
        System.out.print(num + " ");


//        if (num == end) {
//            System.out.println(end);
//            return;
//        }
//
//        System.out.print(num + " ");
//        IncreaseNum(num + 1 , end);

    }

    public static void main(String[] args) {
        int num = 5;
        IncreaseNum(num);
//        int num = 5;
//        int end = 25;
//        IncreaseNum(num , end);
    }
}
