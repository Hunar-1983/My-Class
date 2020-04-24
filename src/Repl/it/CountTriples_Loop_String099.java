package src.Repl.it;
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
 Print out the number of triples in the given string. The triples may overlap.
Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
 */
import java.util.Scanner;

public class CountTriples_Loop_String099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

            for (int i = 0; i <= str.length()-3; i++){
                String sameLetter = ""+str.charAt(i)+str.charAt(i)+str.charAt(i);
                if (str.substring(i, i+3).equals(sameLetter)){

                    count++;
                }
            }
        System.out.println(count);

    }
}
