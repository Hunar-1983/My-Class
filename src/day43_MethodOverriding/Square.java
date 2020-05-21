package src.day43_MethodOverriding;

public class Square extends Shape {

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void calculateArea(){  // now we did overriding our method in super class
        area = side * side;
        System.out.println("Area of the square: "+ area);
    }
    public void calculatePerimeter(){  // now we did overriding our method in super class
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: "+ perimeter);
    }

}
