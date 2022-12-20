package com.Alpha.BitManipulation;

import static com.Alpha.BitManipulation.SetIthBit.setbit;
import static com.Alpha.BitManipulation.clearIthBit.clearbit;

public class UpdateIthBit {
    public  static int updatebit(int n , int ithbit,int newbit) { // here if the newbit means the value we want to insert
//                                                                is 0 the we call the clearbit function with passing the
//                                                                values of numeber and ithbit.

        //approch 1
//        if (newbit == 0){
//            return clearbit( n , ithbit);
//        }
//        else {
//            return setbit(n, ithbit);
//        }
//    }

        //approch 2
        n  = clearbit(n , ithbit);
        int bitmask = newbit<<ithbit;
        return n | bitmask;
    }
    public static void main(String[] args) {
//        System.out.println(updatebit(5 , 2 , 1));
        System.out.println(updatebit(5,2,0));
    }
}
