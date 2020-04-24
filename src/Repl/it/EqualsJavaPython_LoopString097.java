package src.Repl.it;

import java.util.Scanner;
/*
Given a string, print out true if the number of appearances of "java"
anywhere in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
public class EqualsJavaPython_LoopString097 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int counJava = 0;
        int countPython = 0;
        for (int i = 0; i<=sentence.length()-6;i++){
            if (sentence.substring(i, i+4).equals("java")){
                counJava++;
            }else if (sentence.substring(i, i+6).equals("python")){
                countPython++;
            }
        }
        if (countPython == counJava){
            System.out.println("true");
        } else System.out.println("false");

    }
}
