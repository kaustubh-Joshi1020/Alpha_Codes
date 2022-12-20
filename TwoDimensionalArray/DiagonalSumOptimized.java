package com.Alpha.TwoDimensionalArray;

public class DiagonalSumOptimized {
    public static void diagonalsum(int Matrix[][]){
        int sum = 0;

        for (int i = 0; i < Matrix.length; i++) {
            sum = sum + Matrix[i][i];

            if(i != Matrix.length-1-i){
                sum = sum + Matrix[i][Matrix.length-1-i];
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int Matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        diagonalsum(Matrix);
//        System.out.println(Matrix.length);
    }
}

