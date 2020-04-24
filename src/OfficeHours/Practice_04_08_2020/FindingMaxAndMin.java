package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648; //==> smaller number can 'int' accepted in java.
        int min = 214748367; //==> larger number can 'int' accepted in java.
        int i = 1;
        while (i<4){
            System.out.println("Enter numbers");
            int num = input.nextInt();
            if (num > max ){ // wichever the user input id larger, will be assigned to max
                max = num;
            } else if (num < max){ // wichever the user input is smaller , will be assigned to min
                min = num;
            }

            i++;
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);


    }
}
