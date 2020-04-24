package src.day18_nestedLoops;

public class Nested_Loop2 {
    public static void main(String[] args) {
/*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *

 */
        for (int z =1; z<=9; z++) {
            for (int i = 1; i <= z; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("========================");

    /*
        * * * * * * * * *
        * * * * * * * *
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
     */

            for (int q=9; q>=0; q--){
                for (int a = 1; a <= q; a++) {
                    System.out.print("* ");

            }
                System.out.println();
        }
        System.out.println("===================");
/*
a
a b
a b c
a b c d
a b c d e

 */

            for (char z = 'a'; z <='e'; z++) {
                for (char ch = 'a'; ch <= z; ch++) {
                    System.out.print(ch + " ");
                }
                System.out.println();

            }





        for (char z = 'a'; z <='z'; z++) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }


        for (char z = 'z'; z >='a'; z--) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }


    }
}
