package com.Alpha.Recursion;

public class PowerOfNum {
    public static int Power(int x , int n){
        if (n == 0){
            return 1;
        }
        int a = Power(x , n-1);
        return x * a;
    }

    public static void main(String[] args) {
        System.out.println(Power(2 , 10));
    }
}
