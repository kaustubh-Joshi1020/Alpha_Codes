package com.Alpha.Recursion;

public class SumOfNaturalNum {
    public static int sumnatural(int n){
        if (n == 1){
            return 1;
        }
        int FSM1 = sumnatural(n-1);
        int FS = n + FSM1;
        return FS;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumnatural(n));
    }
}
