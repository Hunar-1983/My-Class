package src.My_Practice;

import java.sql.PreparedStatement;
import java.util.Arrays;
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

        int [] num = {2, 3, 5, 4, 9};
        int [] arr = new int[num.length];
        for (int i = 0; i < num.length; i++){
            arr[i] = num [i];
        }
        Arrays.sort(arr);
        int count = 0;
        for (int each : num){
            for (int each2 : arr){
                if (each== each2) count++;
            }
        }
        System.out.println(count == num.length);
    }

}