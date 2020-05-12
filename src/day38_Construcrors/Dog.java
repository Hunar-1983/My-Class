package src.day38_Construcrors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){
        name = "unknown";
        breed = "unknown";
        age = 0;
    }
    public Dog(String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;
    }
    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "unknown";
    }

    public String  toString(){
       return "Name: "+name+", breed: "+breed+", age: "+age;
    }


}
