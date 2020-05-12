package src.day38_Construcrors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator Hunar = new SalaryCalculator(60, 40, 8.25/100, 0.2);
        System.out.println(Hunar);

        System.out.println("==================");

        SalaryCalculator Roshna = new SalaryCalculator(55, 40, 8.75/100, 0.2);
        System.out.println(Roshna);
    }
}
