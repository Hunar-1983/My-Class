package src.day22_Arrays_Loop;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;
/*
Task02:
 1. Write a program that will take five Strings and save them into
  an array called arr.
 2. use for each loop to print out the first three letter of each element
  of arr, one per line. You can assume that every element of arr is at
  least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
 */
public class ScannerWithArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        String [] arr = new String [5];

        for (int i = 0; i <= arr.length-1; i++){
        arr [i]  = input.next();
        }

        for (String each : arr){
            String result = each.substring(0,3);
            System.out.println(result);
        }




    }
}
