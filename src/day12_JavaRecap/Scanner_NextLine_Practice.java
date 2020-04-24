package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Building number: ");
        int Bnumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter Street name: ");
        String street = input.nextLine();

        System.out.println("Enter the zip code: ");
         int zipCode = input.nextInt();

         input.nextLine();

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();

        String fullAdrress = Bnumber + " "+ street + ", "+ cityState+" "+ zipCode;
        System.out.println(fullAdrress);

    }
}
