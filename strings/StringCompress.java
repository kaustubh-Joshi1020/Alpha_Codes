package com.Alpha.strings;

public class StringCompress {
    public static String Compress(String str){
        String FinalString = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            FinalString += str.charAt(i);
            if (count > 1) {
                 FinalString += Integer.toString(count);
            }
        }
        return FinalString ;
    }

    public static void main(String[] args) {
     String str = "abc";
        System.out.println(Compress(str));
    }
}
