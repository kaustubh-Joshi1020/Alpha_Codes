package com.Alpha.Divide_and_Concure;

import java.util.Arrays;

public class Quicksort {

    public static void quick(int[] arr , int si , int ei){
        if (si >= ei){
            return;
        }
        int pivot_index = partition(arr , si ,ei);
        quick(arr, si, pivot_index-1);//left of pivot
        quick(arr, pivot_index+1, ei);//right of pivot
    }
   public static int partition(int[] arr , int si , int ei){
       int pivot_number = arr[ei];  // we declared by ourself that we assume the pivot is our ending index
        int i = si -1; // iterator to the array for swapping

               for (int j = si; j < ei; j++) {
                   if (arr[j] <= pivot_number){
                       i++;
                       int temp = arr[j];
                       arr[j] = arr[i];
                       arr[i] = temp;
                   }
               }


        // place the pivot in its right position
       i++;
       int temp = pivot_number;
       arr[ei] = arr[i];
       arr[i] = temp;
       return i;
    }
    public static void main(String[] args) {
    int[] arr = {5,4,3,8,7,6,9,1,2};
       quick(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
