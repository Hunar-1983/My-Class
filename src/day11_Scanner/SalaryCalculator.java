package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;

        // how to calculate total tax (total tax = federalTaxPercentage + federalTax) * salary;

        double totalTax = (federalTaxPercentage+stateTaxPercentage) * salary;

        // salary after tax = salary - totalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is : $"+ salaryAfterTax);
        System.out.println("total tax : $ " + totalTax);
    }
}
