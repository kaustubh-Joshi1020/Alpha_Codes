package com.Alpha.TwoDimensionalArray;

public class SpiralMatrix {
    public static void spiralmatrix(int[][] Matrix) {
        int start_col = 0;
        int ending_col = Matrix[0].length -1;
        int start_row = 0;
        int ending_row = Matrix.length -1 ;

        while (start_row <= ending_row && start_col <= ending_col) {


            //this is for printing top row
            for (int j = start_col; j <= ending_col; j++) {
                System.out.print(Matrix[start_row][j] + " ");
            }

            //this is for printing right column
            for (int i = start_row + 1; i <= ending_row; i++) {
                System.out.print(Matrix[i][ending_col] + " ");
            }

            //this is for printing bottom row
            for (int j = ending_col - 1; j >= start_col; j--) {
                System.out.print(Matrix[ending_row][j] + " ");
            }

            //this is for printing left column
            for (int i = ending_row - 1; i > start_row; i--) {
                System.out.print(Matrix[i][start_col] + " ");
            }

            start_col++;
            start_row++;
            ending_col--;
            ending_row--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int Matrix[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                          };
        spiralmatrix(Matrix);
    }
}

