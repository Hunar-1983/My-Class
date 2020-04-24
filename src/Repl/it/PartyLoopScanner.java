package src.Repl.it;

import java.util.Scanner;

/*
Imagine you have a party and need to form the list of the guests.
(Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
Example of the program:
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda

 */
public class PartyLoopScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
       while (true){
           System.out.println("Please enter guest name:");
        String answer = input.next();
           name += answer;
           System.out.println("Do you want to enter new guest name:");
        String answer1 = input.next();
        while (!(answer1.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("No")) ) {
            System.out.println("You should select 'Yes' or 'No'");
            String answer2 = input.next();

        boolean a= (answer2.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("No"));
            break;
        }

        if (answer1.equalsIgnoreCase("No")){
            break;
        }
           name += ", ";
       }

        System.out.print("Guest's list: "+name);

    }
}
