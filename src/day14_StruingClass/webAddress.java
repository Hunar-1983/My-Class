package src.day14_StruingClass;

import java.util.Scanner;
public class webAddress{
public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your web address");

        String webAddress =input.nextLine();
        webAddress = webAddress.toLowerCase();
        if (webAddress.startsWith("www.") && webAddress.endsWith(".com") || webAddress.endsWith(".edu") || webAddress.endsWith(".net")|| webAddress.endsWith(".Gov")){
        System.out.println("valid");
        } else {
        System.out.println("invalid");
        }

        }
        }