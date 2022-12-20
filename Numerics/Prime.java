package com.Alpha.Numerics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        int num = 9;
        boolean IsPrime = true;
        for (int i = 2; i <num -1 ; i++) {
            if (num % i == 0){
               IsPrime = false;
            }
        }
        System.out.println(IsPrime);
    }
    }

