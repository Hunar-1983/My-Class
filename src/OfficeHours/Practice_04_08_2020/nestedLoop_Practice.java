package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {
    public static void main(String[] args) {

        int j = 1;
        while (j < 6) {

            for (int i = 1; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();
            j++;
        }

        System.out.println("==================");
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        int a = 1;
        while (a <= 15) {
            for (int k = 1; k <= 20; k++) {
                System.out.print("* ");
            }
            System.out.println();
            a++;
        }

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
         */
        System.out.println("===================");
    for (int s = 1; s <=7; s++) {
        for (int d = 1; d <= s; d++) {
            System.out.print("* ");
        }
        System.out.println();

    }

        for (int s = 7; s >=1; s--) {
            for (int d = 1; d <= s; d++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}