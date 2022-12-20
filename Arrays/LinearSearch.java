package com.Alpha.Arrays;

public class LinearSearch {
    public static int linearsearch(int n[] , int key){
        for (int i = 0; i <n.length; i++) {
            if(n[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {5,3,9,6,2,8,4};
        int key = 4;
        int index = linearsearch(n , key);

        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is at index :" + index);
        }
    }
}
