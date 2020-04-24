package src.Repl.it;

import java.util.Scanner;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */
public class CatsAndDogs_LoopString_086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

        for (int i = 0; i <= word.length()-3; i++){
            if (word.substring(i, i+3).equals("cat")){
                countOfCats++;
            } else if (word.substring(i, i+3).equals("dog")){
                countOfDogs++;
                }
            }
        if (countOfCats == countOfDogs){
            System.out.println("true");
        } else System.out.println("flase");


    }
}
