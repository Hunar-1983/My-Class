package src.day41_Inheritance.Task01;
/*
    create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
     */
public class Developer extends Employee{

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }
    public void coding(){
        System.out.println(name + " is coding");
    }

    public Developer (String name, double salary, long id, String jobTitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
}
