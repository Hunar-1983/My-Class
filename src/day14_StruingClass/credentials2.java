package day14_StruingClass;

import java.util.Scanner;

/*
valid credentials sre:
user name : cybertek
password: cybertekschool

precondition : username and passwoed cannot be empty
               if they are empty ==> please enter the credentials
if user entered both valid correctly ==> log in
if valid user name, in valid password ==> password incorrect
if invalid user name, valid password ==> user name invalid
if both of them invalid ==> invalid user name and passwoed
 */
public class credentials2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter user name");
        String userName = input.nextLine();

        System.out.println("enter password");
        String password = input.nextLine();

        boolean logIn = userName.equals("cybertek") && password.equals("cybertekschool");
        boolean userNameINCorrect = !userName.equals("cybertek") && password.equals("cybertekschool");
        boolean passwordINCorrect = userName.equals("cybertek") && !password.equals("cybertekschool");

        if (!userName.isEmpty() && !password.isEmpty()) {
            if (logIn) {
                System.out.println("Loggrd in");
            } else if (userNameINCorrect) {
                System.out.println("password is Correct but user name is not Correct");
            } else if (passwordINCorrect) {
                System.out.println("user name is correct but password is not correct");
            } else {
                System.out.println("noth of them in correct");
            }

        } else {
            System.out.println("please enter user name and password");
        }

    }
}
