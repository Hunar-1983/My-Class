package day11_Scanner;
/*
write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */
public class Browsers {
    public static void main(String[] args) {
    String browserName = "opera";

    switch (browserName){
        case "Chrome":
            System.out.println("Chrome is opening...");
            break;

        case "firefox":
            System.out.println("firefox is opening...");
            break;

        case "opera":
            System.out.println("opera is opening...");
            break;

        case "Safari":
            System.out.println("safari is opening...");
            break;
        default:
            System.out.println("Invalid browser name, please give the right browser name");

    }
    }
}
