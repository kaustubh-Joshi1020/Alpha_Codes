package com.Alpha.strings;

public class ReturnSubString {
    public static void SubString(String str , int si , int ei){
        String whole = "";
        for ( int i = si; i < ei; i++) {

            whole  = whole + str.charAt(i);
        }
        System.out.println(whole);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        SubString(str , 0 ,5); // also substring function can use.

    }
}
// str , si ,ei
// for si to ei
//char at i store in variable