package day12_JavaRecap;

import java.util.Scanner;

public class SumFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = 0;

        if(num1>0){
            sum += num1;
        }
        if (num2 > 0){
            sum += num2;
        }
        if (num3 > 0){
            sum += num3;
        }
        if (num4 > 0){
            sum += num4;
        }
        if (num5 > 0){
            sum += num5;
        }
        System.out.println("sum of positive number is: "+ sum);
        /*
        Write a program that asks to enter five numbers and print
        the numbers in ascending order.
        Ex: 5, 4, 1, 2, 3

        output: 1, 2, 3, 4, 5
         */

        System.out.println("Enter Three Number!");

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int number3 = input.nextInt();



        String report = (number1 < num2 && number1 < number3 && number2 < number3)? number1+", "+number2+", "+number3

                :(number1 > number2 && number2 < number3 && number1 < number3)? number2+", "+number1+", "+number3

                :(number1 > number2 && number1 > number3 && number2 < number3)? number2+", "+number3+", "+number1

                : number3+", "+number2+", "+number1;



        System.out.println("The ascending your are entered is: "+ report);



    }
}
