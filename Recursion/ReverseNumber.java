package com.Alpha.Recursion;

public class ReverseNumber {
    public static void ReverseNum(int num){
        if (num == 1){            // this is my Base case to stop the Recursive function.
            System.out.print("1");
            return;
        }

        System.out.print(num +" ");
        ReverseNum(num - 1); // this is my recursive function.
    }

    public static void main(String[] args) {
        int n = 10;
        ReverseNum(n);
    }
}
