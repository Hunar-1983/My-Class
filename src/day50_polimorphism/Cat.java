package src.day50_polimorphism;
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */
public final class Cat extends Animal{  // we did this class as a final coz we don't want it has a sub class
    public String catName;

    public Cat (String catName, String gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    public void scratch(){
        System.out.println(catName + "is scratching himself!");
    }

    @Override
    public void eat() { // now e have 3 variable and 2 methods
        System.out.println(catName + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(catName + " is sleeping");
    }
}
