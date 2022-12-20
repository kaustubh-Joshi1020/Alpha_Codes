package com.Alpha.Functions;

public class Binomial {

    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void Binomialcoff(int n , int r){
        int n_facto = factorial(n);
        int r_facto = factorial(r);
        int nmr_facto = factorial((n - r));
        int ncr = n_facto / r_facto * nmr_facto;
        System.out.println(ncr);
    }

    public static void main(String[] args) {
        Binomialcoff(6,5);
    }
}
