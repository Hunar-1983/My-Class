package src.My_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int spaces = 5;
        int rows = 6;

        for (int i = 1; i < 6; i++){
            for(int k=0; k<spaces; k++){ System.out.print(" "); }
            spaces -= 1;
            for (int k =0; k <i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}