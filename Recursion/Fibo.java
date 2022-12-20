package com.Alpha.Recursion;

public class Fibo {
    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int FNM1 = fibo(n-1);
        int FNM2 = fibo(n-2);
        return FNM1 + FNM2;
    }

    public static void main(String[] args) {
        int n =6;
        System.out.println(fibo(n));
    }
}
