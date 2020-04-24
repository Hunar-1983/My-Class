package day23_methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Method_WithParameters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        EligibleToBuyAlcohol(age);
    }

    public static void EligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eleigible to buy alcohol");
        } else System.out.println("Eleigible to buy milk");
    }



    }
