package com.Alpha.Arrays;



public class MaxSumPrefix {
    public static void subarray(int number[]) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];


        //making prefix array
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i -1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int first = i;
            for (int j = i; j < number.length; j++) {
                int last = j;
//                int sum = 0;

                sum = first ==0 ? prefix[last]:prefix[last] - prefix[first -1];

                if(max_sum < sum){
                    max_sum = sum;
                }
//                System.out.println();
            }

//            System.out.println();
        }
        System.out.println("the max sum is: "+max_sum);
    }


    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subarray(number);
    }
}

