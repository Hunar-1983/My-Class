package src.day28_DateTime;

import java.time.LocalDate;

/*
Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localDates and store their birthdays in the same order
	3. use for loop to print out your friends' names and their birthdays
 */
public class LocalDate_Practice {
    public static void main(String[] args) {
        String [] friends = {"john", "Aaron", "Daniel"};

        LocalDate johnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday = LocalDate. of(2010, 5, 6);

        LocalDate [] birthdays = {johnBirthday, AaronBirthday, DanielBirthday}; // LocalDAte Array to store LocalDates in it;

        for (int i = 0; i < friends.length; i++){
            String name = friends[i]; // friends[i]; is name of friends and is String so we can initialize it in a String;
            LocalDate bd = birthdays[i]; // birthdays[i];  is birthday of friends and is LocalDate so we can initialize it in a LocalDate variable;
            System.out.println(  name + "'s birthday is "+ bd  );
        }
    }
}
