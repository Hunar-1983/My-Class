package src.day49_Polymorphisim;

public abstract class Employee {
    String name;    long id;       String jobTitle;     double salary;

    public abstract void work();

    public String toString(){
        return "Name: "+ name + ", Employee's ID: "+ id+", Job title: "+jobTitle+ ", Salary: "+salary;
    }
}

