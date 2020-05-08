package src.day36_StaticBlock;

import src.OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {
    static String name;
    static Tester tester1 = new Tester();
     // tester1.setInfo("Hunar", 123, "SDET", 120000); con not call this method here because is not accepted

    int insVariable;

    static {
        // this block gets executed as soon as the class is loaded
        // designed to initialize static variable
        name = "Cybertek School";
        tester1.setInfo("Hunar", "SDET", 120000, 23642);
        tester1.setInfo("Hasti", "SDET", 120000, 23642); // top to bottom

         //   insVariable = 300;  is not accepted because static only accepted static variable.

      //  StaticBlock4 obj1 = new StaticBlock4(); // here we create object to call insVariable and this is only way to call instance variable in Static block;
        //        obj1.insVariable = 300; // do not use static block for initializing instance variables.
    }

    public static void main(String[] args) {
        System.out.println(name); // Cybertek School

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        obj2.insVariable = 300;

    }
}
