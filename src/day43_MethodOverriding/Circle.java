package src.day43_MethodOverriding;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
     this.radius = radius;
    }

    public void calculateArea(){ // now we did overriding our method in super class
        area = radius * radius * PI;
        System.out.println("Area of the circle: "+ area);
    }

    public void calculatePerimeter(){   // now we did overriding our method in super class
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: "+ perimeter);
    }

}
