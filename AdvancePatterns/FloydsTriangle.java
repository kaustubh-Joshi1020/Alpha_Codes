package com.Alpha.AdvancePatterns;

public class FloydsTriangle {
    public static void floydestriangle(int n){
        int numbers = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(numbers + " ");
                numbers++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydestriangle(5);
    }
}
