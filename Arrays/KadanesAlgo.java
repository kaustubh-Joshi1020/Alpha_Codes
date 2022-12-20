package com.Alpha.Arrays;

public class KadanesAlgo {
    public static void kadnes(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i <=numbers.length ; i++) {
                current_sum  =current_sum + numbers[i];
                if (current_sum < 0) {
                    current_sum = 0;
                }
                max_sum  = Math.max(current_sum , max_sum);
        }
        System.out.println("the maximum sum is : " + max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadnes(numbers);
    }
}
