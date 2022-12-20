package com.Alpha.Numerics;

public class Reverse {

    public static void main(String[] args) {
	int num = 10889;
    int get_num;
    int rev = 0;

       // while(num > 0) // this is basic method
//        {
//            get_num = num % 10;
////        System.out.print(get_num);
//            num = num/10;
//
//        }

    while(num > 0) // this is storing the reverse method.
        {
        get_num = num % 10;
        num = num/10;
        rev = (rev * 10) + get_num;
    }
        System.out.println(rev);




    }
}
