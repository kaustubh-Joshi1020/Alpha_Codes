package com.Alpha.Patterns;

    public class AlphabetPattern {
        public static void main(String[] args) {
            int n =7;
            char ch = 'A';
            for (int line = 1; line <= n; line++) {
                for (int charaters = 1; charaters <=line ; charaters++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
}
