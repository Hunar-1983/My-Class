package src.day22_Arrays_Loop;

import java.util.Arrays;

/*
3. write a program that can return the number of appearances of "java"
and "python" anywhere in the sentence
   (it's similar to the task 97 in repl.it, But this time you MUST use
    arrays and for each loop)
 */
public class Java_Python {
    public static void main(String[] args) {

        String sentence = "I ilke java and javascript and python";
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        int countJava = 0;
        int countPyhton = 0;
        for (String each : arr) {
            if (each.contains("java")) {
                countJava++;
            }
            if (each.contains("python")) {
                countPyhton++;
            }
        }
            System.out.println(countJava);
            System.out.println(countPyhton);
            System.out.println(countJava == countPyhton);

    }
}