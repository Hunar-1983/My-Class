package src.Repl.it;

import java.util.Scanner;
/*
   by n!, is the product of all positive integers less than or equal to n.
     Calculate factorial and output result to the console.
Example:
input: 5
output: 120
 */
public class Factorial_Loop092 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            long b = 1;

        while (n > 1){
            b *= n;
            n--;
            }

        System.out.println(b);

    }
}
