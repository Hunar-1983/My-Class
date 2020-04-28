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
        String word = "a1b2c3";
        String nums="0123456789";
        int res=0;

        for (int i =0; i < word.length(); i++){
            for (int k =0; k < nums.length(); k++){
                if (word.charAt(i) == nums.charAt(k)){
                    int num = Integer.parseInt(word.charAt(i)+"");
                    res += num;
                }
            }
        }
        System.out.println(res);

    }}