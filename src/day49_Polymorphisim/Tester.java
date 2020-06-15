package src.day49_Polymorphisim;

public class Tester extends Employee{
    public Tester (String name, long id, String jobTitle, double salary){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as a tester!");
    }

    //Employee tester1 = new Tester();
}
