package src.My_Practice;

import javax.swing.plaf.IconUIResource;
import java.beans.PropertyEditorSupport;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int k = 0;

        while(true) {
            System.out.println("Day "+ (k++) +" "+Arrays.toString(inhabitants));
            for (int i = 0; i <= inhabitants.length - 1; i++) {
                inhabitants[i] = inhabitants[i] / 2;
            }
            if (Arrays.equals(inhabitants, new int[8])) break;
        }
        System.out.println("Day "+ (k) +" "+Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

        }


}
