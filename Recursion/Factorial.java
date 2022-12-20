package com.Alpha.Recursion;

public class Factorial {
    public static int facto(int n){
        if (n == 0){
            return 1;
        }
      int NM1 = facto(n-1);
      int FN =  n * NM1;
      return FN;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("the factorial is :" + facto(n));
    }
}
