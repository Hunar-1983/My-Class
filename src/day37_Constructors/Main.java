package src.day37_Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner input = new Scanner(System.in);
        int count =1;
        double total = 0;
        int min = 10;
        int max = 0;
        for (int i =1; i < 8; i++){
            System.out.println("Enter score for judge "+count+":");
            int num = input.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
            count++;
            total += num;
        }
        total =  total - (max + min);

        System.out.println("Enter difficulty:");
        double a = input.nextDouble();
         total = total * a  * 0.6;
        System.out.printf("Total: %.2f",total);
    }
}
