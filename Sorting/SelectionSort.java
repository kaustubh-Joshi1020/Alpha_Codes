package com.Alpha.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minimum_ele = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minimum_ele] > arr[j]){
                    minimum_ele = j;
                }
            }
            int temp = arr[minimum_ele];
            arr[minimum_ele] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        selectionsort(arr);
    }
}
