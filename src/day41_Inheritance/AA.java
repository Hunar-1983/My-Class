package src.day41_Inheritance;

public class AA {
    public class Employee {
        /*
      variables: salary, name, id, jobTitle, gender
              Actions: toString
       */
        public double salary;
        public String name;
        public long ID;
        public String jobTitle;
        public char gender;

        public String toString() {
            return "Name: " + name + ", Employee ID: " + ID + ", Job Title: " + jobTitle + ", Gender: " + gender + ", salary: " + salary;
        }
    }

    class Tester extends Employee {
        /*
        create sub class of employee name it Tester:
                variables: salary, name, id, jobTitle, gender
                actions: reportingBug, testing
         */
        public void reportingBug() {
            System.out.println(name + " doing reporting bug");
        }

        public void testing() {
            System.out.println(name + " doing testing");
        }
    }

     class Developer extends src.day41_Inheritance.Task01.Employee {
        /*
        create subclass of employee name it developer:
             variables: salary, name, id, jobTitle, gender
             action: fixingBug, coding
         */
        public void fixingBug(){
            System.out.println(name + " is fixing bug");
        }
        public void coding(){
            System.out.println(name + " is coding");
        }
    }


     class BusinessAnalyst extends src.day41_Inheritance.Task01.Employee {
        /*
        create subclass of employee name it business analyst
                     variables: salary, name, id, jobTitle, gender
                     actions: writingRequiremnts, gathering
         */
        public void writingRequirements(){
            System.out.println(name + " is writing requirements");
        }
        public void gathering(){
            System.out.println(name + " is gathering information");
        }
    }

}

