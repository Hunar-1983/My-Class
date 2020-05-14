package src.day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name: "+ PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

        System.out.println("Grade: " + PersonalInfo.grade );

        //  System.out.println( "SSN: "+PersonalInfo.SSN ); // private is only accessible with in same class
        //  System.out.println( "ID: "+PersonalInfo.ID );

        System.out.println("Age: "+PersonalInfo.age);

        PersonalInfo obj = new PersonalInfo();
        System.out.println(  obj.name  );
        System.out.println(  obj.gender  );

        System.out.println(  obj.grade  );
        System.out.println(  obj.age  );

     //   System.out.println(  obj.SNN  );
     //   System.out.println(  obj.ID  );




    }
}
