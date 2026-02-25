package com.interview.JavaDev;

public class PalindromeString {

    public static void main(String[] args) {
        String or = "nithin", rev = "";
        char ch;
        for (int i = 0; i < or.length(); i++) {
            ch = or.charAt(i);
            rev = ch + rev;
        }
        if (rev.equals(or))
            System.out.println("pal");
        else
            System.out.println("not pal");

    }
}
