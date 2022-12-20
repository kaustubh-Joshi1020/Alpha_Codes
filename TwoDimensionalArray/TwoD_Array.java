package com.Alpha.TwoDimensionalArray;

import java.util.Scanner;

public class TwoD_Array {

    public static void ArrayInsertion(int[][] Matrix){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) // Matrix[0].length this will calculate the column.
            {
                Matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("the elements are :");
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) // Matrix[0].length this will calculate the column.
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean KeyInArray(int[][] Matrix, int key){
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) // Matrix[0].length this will calculate the column.
            {
                if(Matrix[i][j] == key){
                    System.out.println("The key is at :" + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("key not found");// if return true hits then the false does not return.
        return false;
    }

    public static void LargestInArray(int[][] Matrix){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) // Matrix[0].length this will calculate the column.
            {
               if (Matrix[i][j] > largest){
                   largest = Matrix[i][j];
               }
            }
        }
        System.out.println("The largest value is : "+ largest);
    }

    public static void SmallestInArray(int[][] Matrix){
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++)
            {
                if (Smallest > Matrix[i][j]){
                    Smallest = Matrix[i][j];
                }
            }
        }
        System.out.println("The Smallest value is : "+ Smallest);
    }

    public static void main(String[] args) {
        int[][] Matrix = new int[3][3];
        ArrayInsertion(Matrix);
        KeyInArray(Matrix , 5);
        LargestInArray(Matrix);
        SmallestInArray(Matrix);
    }
}
