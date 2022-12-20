package com.Alpha.TwoDimensionalArray;

public class DiagonalSum {
    public static void diagonalsum(int Matrix[][]){
        int sum = 0;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if(i==j){
                    sum = sum + Matrix[i][j];
                }
                else if(i+j == 3){
                    sum = sum + Matrix[i][j];
                }
            }
        }
        System.out.println("The sum of diagonal is :" + sum);
    }

    public static void main(String[] args) {
        int Matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        diagonalsum(Matrix);
    }
}
