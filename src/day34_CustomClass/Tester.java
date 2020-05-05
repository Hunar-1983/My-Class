package src.day34_CustomClass;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create  their automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
 */
public class Tester {

    String name;
    long employeeID;
    String JobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString (){
        return "Nmae: "+name+", job Title: "+JobTitle+", employeeID: "+employeeID+", salary: "+ salary;
    }


}
