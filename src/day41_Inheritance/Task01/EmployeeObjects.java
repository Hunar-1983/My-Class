package src.day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Hunar",180000, 12345, "Developer", 'M' );

     // dev1.reportingBug();
        dev1.fixingBug();
        dev1.coding();
        System.out.println(dev1);

        Tester tester1 = new Tester("Roshna", 120000, 6789, "SDET", 'F');
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);

        BusinessAnalyst ba1 = new BusinessAnalyst("Hasti", 130000, 3546, 'M');
        ba1.gathering();
        ba1.writingRequirements();
        System.out.println(ba1);

    }
}
