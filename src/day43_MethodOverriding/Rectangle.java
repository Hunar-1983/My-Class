package src.day43_MethodOverriding;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){  // now we did overriding our method in super class
        area = width * length;
        System.out.println("Area of the rectangle: "+ area);
    }

    public void calculatePerimeter(){  // now we did overriding our method in super class
        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the rectangle: "+ perimeter);
    }
}
