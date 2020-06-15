package src.day50_polimorphism;
/*
 1. create a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public abstract class Animal {
    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void methodA(){  // static method can not be overriding
        System.out.println("Animal class");
    }



}

