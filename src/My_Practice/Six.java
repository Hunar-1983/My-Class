package src.My_Practice;

import java.sql.PreparedStatement;
import java.util.Scanner;

/*
2. write a return method that accepts two strings str1 & str2, and returns
the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
 */
public class Six {
    public static void main(String[] args) {
        String one = "123458";
        String two = "abcdeaaa";
        String result = "";
        int Big;

        if (one.length() > two.length()) Big=one.length();
        else  Big=two.length();
        for (int i=0; i < Big; i++){
            if (i<one.length()) result += one.charAt(i);
            if (i<two.length()) result += two.charAt(i);

        }
        System.out.println(result);}}