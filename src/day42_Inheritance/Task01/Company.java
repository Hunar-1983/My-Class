package src.day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called company:
        create 3 objects of employee and set thier info
 */
public class Company {
    public static Employee employee1 = new Employee();;
    public static Employee employee2 = new Employee();;
    public static Employee employee3 = new Employee();;

    static{
    employee1.setEmployeeInfo("Huar", 36, 'M', 180000, 15432, "Developer");

    employee2.setEmployeeInfo("Roshna", 36, 'F', 150000, 26534, "SDET");

    employee3.setEmployeeInfo("Hasti", 10, 'M', 100000, 3654, "Developer");

    }
    public static void main(String[] args) {

        Employee [] employees = {employee1, employee2, employee3};

        for (int i =0; i < employees.length; i++){
            System.out.println("Name: "+ employees[i].name+ ", ID: " + employees[i].employeeID  );
        }




    }
}
