package com.Alpha.Recursion;

public class PowerOfNumOptimized {
    public static int power(int num , int p){

        if (p == 0){
            return 1;
        }
        int Tempans = power(num , p/2);
        int ans = Tempans * Tempans;        //this is more optimized solution.
      // int ans = power(num , p/2) * power(num , p/2);

        if (p%2 != 0){
            ans = num * ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2 , 10));
    }
}
