package com.Alpha.AdvancePatterns;

public class Butterflypattern {
    public static void butterfly(int n){
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <=i ; j++) { // first star
                System.out.print("*");
            }
            for (int k = 1; k <=2 * (n-i) ; k++) {// then spaces
                System.out.print(" ");
            }
            for (int l = 1; l <=i ; l++) {// second stars
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) { // first star
                System.out.print("*");
            }
            for (int k = 1; k <=2 * (n-i) ; k++) {// then spaces
                System.out.print(" ");
            }
            for (int l = 1; l <=i ; l++) {// second stars
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        butterfly(6);
    }
}
