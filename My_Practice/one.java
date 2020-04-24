package My_Practice;

import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.security.cert.CertSelector;
import java.util.Arrays;
import java.util.Scanner;

public class one {
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
        String unique = "";

        for (String each1: words){
            int count =0;
            for (String each2: words){
                if (each1.contains(each2)){
                    count++;
                }
            }
            if (count ==1){
                unique += each1+"\n";
            }
        }
        System.out.println(unique);

    }
}