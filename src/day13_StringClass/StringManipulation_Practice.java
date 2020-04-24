package src.day13_StringClass;

import java.util.Scanner;

public class StringManipulation_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String firstName = fullName.substring(0,  fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1    ); // School
        //cYbeRTEK

        firstName = firstName.substring(0,1).toUpperCase() +  firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);



        /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
        System.out.println("Enter Your First Name!");
        String first = input.next();

        System.out.println("Enter Your Last Name!");
        String last = input.next();

        String First = first.substring(0, first.indexOf("")+1).toUpperCase();
        String Last = last.substring(0, last.indexOf("")+1).toUpperCase();

        String n1 = First.substring(0, 1);
        String n2 = Last.substring(0, 1);

        System.out.println(n1 + n2);

    }
}
