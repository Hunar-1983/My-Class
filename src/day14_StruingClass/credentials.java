package src.day14_StruingClass;

import java.util.Scanner;

/*
userNmae : cybertek
psddWord: cybertekschool
 */
public class credentials {
    public static void main(String[] args) {

            String validUserName = "cybertek";
            String validPassWord = "cybertekschool";

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username");

            String inputUsername = input.next();

            System.out.println("Enter your password");

            String inputPassWord = input.next();

            boolean validCredentials = inputUsername.equals(validUserName) && inputPassWord.equals(validPassWord);

            if (validCredentials) {

                System.out.println("Log in successfully");

            } else {

                System.out.println("Invalid credentials");

            }

        }
    }

