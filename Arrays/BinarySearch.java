package com.Alpha.Arrays;

public class BinarySearch {

    public static int binaarysearch(int num[], int key ){
        int start = 0 , end = num.length-1;


        while(start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) { // num[mid] because we have to search the mid in our array.
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};// binary search works only on sorted array.
        int key = 8;
        System.out.println(binaarysearch(num , key));
    }
}
