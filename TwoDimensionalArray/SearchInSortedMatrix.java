package com.Alpha.TwoDimensionalArray;

public class SearchInSortedMatrix {
    public static boolean StairCaseSearch(int matrix[][] , int key){
        int row = matrix.length-1; int col = matrix[0].length-1;//this is the starting cell of our iteration

       while (row < matrix.length && col >= 0){
        if (key == matrix[row][col]){
            System.out.println("the key is at :" + row + "," + col);
            return true;
        }
        else if (key < matrix[row][col]){
            col--;
        }
        else {
            row++;
        }
    }
       System.out.println("key not found");
        return false;
}
    public static void main(String[] args) {
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 33;
        StairCaseSearch(matrix,key);
    }
}
