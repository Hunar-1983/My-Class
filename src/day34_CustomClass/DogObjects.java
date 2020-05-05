package src.day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small", 4 , "White", "Ghost");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5 , "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "Miniature", 2 , "White", "Lucy");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");

        System.out.println("==========================================================");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

         for (int i =0 ; i < puppies.size(); i++){
           Dog eachDog = puppies.get(i);
             System.out.println(eachDog);
         }

        System.out.println("==========================================================");
         // if we want to remove all dogs greater than 2 years, we can do it in this way:

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }


    }
}
