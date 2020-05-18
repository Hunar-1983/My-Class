package src.day41_Inheritance;

public class Fish extends Animal{
    public void swim(){
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {
        Fish fish1 = new Fish();

        fish1.name = "Nemo";
        fish1.weight = 5;
        fish1.size = "small";
        System.out.println(fish1.name);
        System.out.println(fish1.weight);
        System.out.println(fish1.size);

        fish1.eat();
        fish1.move();
        fish1.swim();
        //fish1.bark();
    }
}
