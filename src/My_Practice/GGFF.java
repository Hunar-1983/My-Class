package src.My_Practice;

import sun.jvm.hotspot.types.JFloatField;

import java.util.Scanner;

public class GGFF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        String [] str = new String [words.length];
        String nonDop = "";
        for (int i =0; i < words.length; i++){
            if (!str[i].contains(words[i])){
                nonDop += words[i];
            }
        }
        System.out.println(nonDop);

    }
}