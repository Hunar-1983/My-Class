package My_Practice;

import src.Important.Array;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

/*
Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
            if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                    if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                    if answer either yes or no ==> please re-enter
     */
public class aa {
    public static void main(String[] args) {
        String str = "AABBCCED";
        String reverse = "";
        for (int i = 0; i < str.length(); i++){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("++++++++++");

        String reverse1 = "";
        for (int i = 0; i < str.length(); i++){
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse1)) System.out.println("this word is palindrome");
        else System.out.println("this word is not palindrome");

            System.out.println("++++++++++");

        String nonDup = "";
        for (int i =0; i < str.length(); i++){
            if (!nonDup.contains(str.charAt(i)+"")){
                nonDup += str.charAt(i);
            }
        }
        System.out.println(nonDup);
        System.out.println("++++++++++");

        String nondup = "";
        String result = "";
        for (int i =0; i < str.length(); i ++){
            if (!nondup.contains(str.charAt(i)+"")){
                nondup += str.charAt(i);
            }
        }
        for (int i = 0; i < nondup.length(); i++){
            int count = 0;
            for (int k =0; k < str.length(); k++){
                if (str.charAt(k) == nondup.charAt(i)){
                    count++;
                }
            }
            if (count == 1){
                result += nonDup.charAt(i)+""+count;
            }
        }
        System.out.println(result);
        System.out.println("++++++++++");

        String unique = "";
        for (int i = 0; i < str.length(); i ++){
            int count1 = 0;
            for (int k =0; k < str.length(); k++){
                if (str.charAt(i) == str.charAt(k)){
                    count1++;
                }
            }
            if (count1 == 1) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
        System.out.println("++++++++++");


    }
    }
