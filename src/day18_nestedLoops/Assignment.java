package src.day18_nestedLoops;
/*
Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
            if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                    if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                    if answer either yes or no ==> please re-enter
     */

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true){
            System.out.println("Hello... Which Bed You Want To Reserve?, We Have 'King Bed', 'Queen Bed' and 'Single Bed'");
            String answer = input.nextLine();
        while (!(answer.equalsIgnoreCase("King bed") ||
                answer.equalsIgnoreCase("Queen bed") ||
                answer.equalsIgnoreCase("Single Bed"))){
            System.out.println("Invalid Answer, We Have 'King Bed', 'Queen Bed' and 'Single Bed', Please Choose One Of Them:");
            answer = input.nextLine();
        }

        if (answer.equalsIgnoreCase("King Bed")){
                totalPrice += 120;
        } else if (answer.equalsIgnoreCase("Queen Bed")){
            totalPrice += 100;
        } else {
            totalPrice += 80;
        }
            System.out.println("Do You Want To Reserve Another Room?");
        answer = input.nextLine();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))   ){
            System.out.println("Invalid chose, please select 'Yes' or 'Not'");
            answer = input.nextLine();
        }
        if (answer.equalsIgnoreCase("NO")){
            System.out.println("Thank You For Choosing Our Service");
            System.out.println("Your Total Price is $"+totalPrice);
            break;
        }


        }




    }
    }







