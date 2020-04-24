package src.day19_Arrays;

import java.awt.*;
import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println( arr.length ); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String[] Testers = new String[3];  // {"Reem", "Madina", "Osman"};
        // index: 0, 1, 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";
        System.out.println(Testers[0]);  // Reem
        System.out.println(Testers[1]); // null
        System.out.println(Testers[2]); // "Osman

        System.out.println(Testers.length);  // 3

        System.out.println("========================================");


    }
}
