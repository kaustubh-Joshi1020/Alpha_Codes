package com.Alpha.Recursion;

public class FriendsPairing {
    public static int pairing(int Totalfriends){
        // base case will be if 1 friend in list then formation is 1, if there are two Totalfriends then the ways to for a pair is
        // two i.e one is single and both can be in pair.
        if (Totalfriends == 1 || Totalfriends == 2){
            return Totalfriends;
        }

        //for single Totalfriends
        int single = pairing(Totalfriends - 1);

        //for multiple pairs
        int multiple = pairing(Totalfriends -2);

        //total ways of pairing
        int total = (Totalfriends-1) + single * multiple;
        return total;

//        return pairing(Totalfriends -1) + (Totalfriends - 1) * pairing(Totalfriends - 2);
//        with this method we also can write code
    }
    public static void main(String[] args) {
        System.out.println(pairing(4));
    }
}
