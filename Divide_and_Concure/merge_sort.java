package com.Alpha.Divide_and_Concure;

import java.sql.Array;
import java.util.Arrays;

public class merge_sort {

    public static void MergeSort(int[] arr , int si , int ei){
       if(si >= ei){
           return;
       }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si , mid);  // this is for the left part of array
        MergeSort(arr , mid+1 , ei); // this is dividing right part
        //merge together in sorted order
        Merge(arr , si, mid , ei);
    }

    public static void Merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        //three pointers
        int i = si; // iterator for first sorted part
        int j = mid+1; // iterator for second sorted part
        int k =0 ; // iterator for temp array

        while (i<= mid && j <= ei){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //getting all leftover elements from left side
        while (i<=mid){
            temp[k++] = arr[i++];
        }

        //getting all leftover elements from right side
        while (j<=ei){
            temp[k++] = arr[j++];
        }

        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        MergeSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
