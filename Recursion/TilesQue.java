package com.Alpha.Recursion;

public class TilesQue {
    public static int Tiles(int n){ // here the length is fixed i.e. 2 * n
        // base case
        if (n == 1 || n == 0){
            return 1;
        }
        // horizontal case
        int vertical = Tiles(n-1);
        // vertical case
        int  horizontal= Tiles(n-2);
        // print answer
        int ans = vertical +horizontal ;
        return ans;
//        return Tiles(n-1) + Tiles(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Tiles(4)); // this is by default 2 * n where the n is our 4.
    }
}
