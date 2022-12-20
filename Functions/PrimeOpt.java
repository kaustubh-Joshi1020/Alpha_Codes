package com.Alpha.Functions;

import java.util.Scanner;

public class PrimeOpt {
    public static boolean IsPrime(int num) {
       if (num == 2){ // adding a corner case
           return true;
       }

        for (int i = 2; i < Math.sqrt(num); i++) { // for (int i = 2; i < num - 1; i++) this is less optimized method.
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        System.out.print( "Is this a prime number :"+IsPrime(num));
    }
}
