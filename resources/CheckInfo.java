package resources;

import src.day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println(PersonalInfo.name );
        System.out.println(PersonalInfo.gender );

       // System.out.println(PersonalInfo.grade ); it gives compiler error because it's default variable and it can not access to them in another package;
       // System.out.println(PersonalInfo.age );it gives compiler error because it's default variable and it can not access to them in another package;

      //  System.out.println(PersonalInfo.SSN );it gives compiler error because it's Private variable and it can not access to them in another class;
      //  System.out.println(PersonalInfo.ID );it gives compiler error because it's private variable and it can not access to them in another class;


        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

       // System.out.println(obj.grade);
        //  System.out.println(obj.age);

     //   System.out.println(obj.SNN);
     //   System.out.println(obj.ID);






    }
}
