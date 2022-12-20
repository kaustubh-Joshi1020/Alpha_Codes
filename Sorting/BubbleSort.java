package com.Alpha.Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr){

        //for loop for turns
        for (int turn = 0; turn < arr.length-1 ; turn++) {
            //for loop for swapping the
            for (int j = 0; j < arr.length-1-turn ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr =  {5,4,1,3,2};
        bubblesort(arr);
    }
}
