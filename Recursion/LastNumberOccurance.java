package com.Alpha.Recursion;

public class LastNumberOccurance {
    public static void lastoccurance(int[] arr, int key, int i){
        if (arr[i] == key){
            System.out.println(i);
            return;
        }
        if (i == 0){
            System.out.println("not found");
            return;
        }
        lastoccurance(arr , key , i-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,6,1,8};
        int  key = 5;
        lastoccurance(arr, key , arr.length-1);
    }
}
