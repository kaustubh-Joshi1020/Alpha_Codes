package com.Alpha.Recursion;

public class Fibonacci {
    public  static int fibo (int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int n = 43;
        System.out.println(fibo(n));
    }
}
