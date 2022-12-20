package com.Alpha.Recursion;

public class SortedArray {
    public static boolean issorted(int[] arr,int i ){

        if ( i == arr.length-1){  // this condition will act as to stop the iteration of the recursive calling function
            return  true;
        }

       if(arr[i] > arr[i + 1]){  // this condition is for wrong input.
           return false;
       }
       return issorted(arr , i + 1);
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6};
        System.out.println(issorted(n , 0));
    }
}
