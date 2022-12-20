package com.Alpha.strings;

public class FindingShortRoute {
    public static float ShortPath(String str){
        int x = 0 , y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch == 'n'){
                y++;
            }
            else if(ch == 's'){
                y--;
            }
            else if (ch == 'e'){
                x++;
            }
            else if (ch == 'w'){
                x--;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String str = "wneenesesensnn";
        System.out.println(ShortPath(str));
    }
}

