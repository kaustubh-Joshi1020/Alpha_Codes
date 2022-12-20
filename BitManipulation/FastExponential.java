package com.Alpha.BitManipulation;

public class FastExponential {
    public static void fastexpo(int num , int pow){
        int ans = 1;
        while (pow  > 0){
            if((pow&1) != 0){
                ans = ans *num;
            }
            num = num * num;
            pow = pow>>1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
            fastexpo(5,3);
    }
}
