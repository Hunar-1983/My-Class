package src.day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+ " is eating "+ food);
    }

    public void drinking (String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public void playing (String play){
        System.out.println(name+ " is playing "+ play);
    }

    public void setDogInfo (String breed, String size, int age, String color, String name){
       this.breed = breed;
       this.size = size;
       this.age = age;
       this.color = color;
       this.name = name;
       // this keyword is used for calling (instatnt variable)
    }

    public String toString() {
        return "Dog Name: " + name + " , breed: " + breed + " , size: " + size+" , color: "+color+" , age: "+age;
    }
}
