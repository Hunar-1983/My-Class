package src.day37_Constructors;

public class StudentsObject {
    public static void main(String[] args) {
     /*  Student student1 = new Student();
       student1.setInfo("Hunar", 36, 'M', "Cybertek");
        System.out.println(student1);
       */
        Student student2 = new Student("Hunar", 36, 'M', "Cybertek");
        System.out.println(student2);

        Student student3 = new Student("Roshna", 36, 'f', "EMU");
        System.out.println(student3);
    }
}
