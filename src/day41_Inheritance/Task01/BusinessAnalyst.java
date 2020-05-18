package src.day41_Inheritance.Task01;
/*
create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {

    public void writingRequirements(){
        System.out.println(name + " is writing requirements");
    }
    public void gathering(){
        System.out.println(name + " is gathering information");
    }

    public BusinessAnalyst (String name, double salary, long id, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = "Business Analyst";
        this.gender = gender;
    }
}
