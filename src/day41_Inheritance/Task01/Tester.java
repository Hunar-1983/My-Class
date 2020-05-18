package src.day41_Inheritance.Task01;

import src.day24_Methods.Test;

/*
   create sub class of employee name it Tester:
           variables: salary, name, id, jobTitle, gender
           actions: reportingBug, testing
create a constructor that can initialize all the attributes of Tester
    */
public class Tester extends Employee{

    public void reportingBug(){
        System.out.println(name+" doing reporting bug");
    }
    public void testing(){
        System.out.println(name + " doing testing");
    }

    public Tester(String name, double salary, long id, String jobTitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }
}
