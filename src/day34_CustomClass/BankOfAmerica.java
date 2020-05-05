package src.day34_CustomClass;

import src.day24_Methods.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Hunar", 61798789, "SDET", 150000);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",150000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",120000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar",334554,"Manual Tester",120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("john",22222,"Uber Driver",60000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5));
        testers.removeIf( p -> !p.JobTitle.contains("SDET"));
       double totalBudget = 0;
        for (Tester each : testers){
           System.out.println(each);
           totalBudget += each.salary;
       }
        System.out.println(totalBudget);



    }
}
