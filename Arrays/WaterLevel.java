package com.Alpha.Arrays;

public class WaterLevel {
    public static int waterlevel(int[] bar_height){

        // find the left max boundry
        int[] LeftMaxBoundry = new int[bar_height.length];
        LeftMaxBoundry[0] = bar_height[0];
        for (int i = 1; i <bar_height.length ; i++) {
            LeftMaxBoundry[i] = Math.max(bar_height[i] , LeftMaxBoundry[i-1]);
        }

        //find the right max boundy
        int[] RightMaxBoundry = new int[bar_height.length];
        RightMaxBoundry[bar_height.length-1] = bar_height[bar_height.length-1];
        for (int i = bar_height.length -2; i >= 0 ; i--) {
            RightMaxBoundry[i] = Math.max(bar_height[i] , RightMaxBoundry[i+1]);
        }

        //calculate water level
        int TrappedWater =0 ;
        for (int i = 0; i < bar_height.length ; i++) {
        int WaterLevel = Math.min(LeftMaxBoundry[i] , RightMaxBoundry[i]);
        //calculate trapped water
        TrappedWater =  TrappedWater + WaterLevel - bar_height[i];
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int[] Bar_Height = {4,2,0,6,3,2,5};
        int ans = waterlevel(Bar_Height);
        System.out.println("the total water level is :" + ans);
//        System.out.println(waterlevel(Bar_Height));
    }

}
