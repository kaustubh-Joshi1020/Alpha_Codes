package com.Alpha.Recursion;

public class FirstNumberOccurance {
    public static void numoccurance(int[] arr , int key, int i){
        if (arr[i] == key){
            System.out.println(i);
            return;
        }

        if (i == arr.length-1){
            System.out.println("key not found");
            return;
        }
        numoccurance(arr ,key,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6,5,2,7,10};
        int key = 3;
        numoccurance(arr , key , 0);
    }
}
