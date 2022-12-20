package com.Alpha.AdvancePatterns;

public class InvertedHalfPyramid {
    public static void invertedhalfpyramid(int n){// n is total number of rows.
        for (int i = 1; i <= n; i++) {// this is for total number of rows to print
            for (int j = 1; j <= n-i; j++) { // this is for total number of spaces to print
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {// this is for printing the total stars.
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedhalfpyramid(5);
    }
}
