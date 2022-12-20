package com.Alpha.Functions;

import java.util.Scanner;

public class Factorial {

    public static void factorial(int n){
        int f=1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.print("the factorial of "+ n +" is :" + f);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
            factorial(n);
    }
}
