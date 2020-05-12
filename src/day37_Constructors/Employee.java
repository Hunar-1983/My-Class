package src.day37_Constructors;

import java.util.ArrayList;
/*
1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
	2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
	3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
 */
public class Employee {
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name :"+name+", Employee ID: "+id+", SSN: "+ssn+", Job Title: "+jobTitle+", Salary: $"+salary+", Gender: "+gender;
    }
}

    class HumanResources{
        static Employee employee1 = new Employee();
        static Employee employee2 = new Employee();
        static Employee employee3 = new Employee();
        static Employee employee4 = new Employee();
        static Employee employee5 = new Employee();
/*
    public static void main (String [] args){

        employee1.setInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    */
    static {
        employee1.setInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
    }
}

 class BankOfAzerbaijan{
     public static void main(String[] args) {

         ArrayList<Employee> list = new ArrayList<Employee>();
         list.add(HumanResources.employee3);
         list.add(HumanResources.employee5);

         System.out.println(list.get(0));
         System.out.println(list.get(1));

     }
 }