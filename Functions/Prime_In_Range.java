package com.Alpha.Functions;

import java.util.Scanner;

public class Prime_In_Range {

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

    public static void prime_in_range(int num){
       for (int i = 2; i <num-1 ; i++) {
           if (IsPrime(i)){
               System.out.print(i + " ");
           }

       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter until you want prime no :");
        int num = scanner.nextInt();
        prime_in_range(num);
    }
}
