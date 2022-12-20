package com.Alpha.Recursion;

public class BinarySearch {
    public static int bs(int[] arr, int key , int start , int end){
       int mid = (start + end) / 2;  //Mid
        // base
        if (arr[mid] == key){
            return mid;
        }
        if(start > end){
            return -1;
        }
        if (key < arr[mid]){
           return bs(arr , key , start , end -1);
        }
        return  bs(arr,key,mid+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        System.out.println(bs(arr , 78 , 0, arr.length -1));
    }
}
