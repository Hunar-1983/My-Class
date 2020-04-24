package day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerClass_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        byte num1 = input.nextByte();
        System.out.println("Enter your Second number");
        byte num2 = input.nextByte();

        int sum = num1 + num2;

        System.out.println("The sum of both number you are entered is "+sum);
    }
}
