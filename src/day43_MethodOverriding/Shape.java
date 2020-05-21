package src.day43_MethodOverriding;
/*
1. create a class called Shape:
    Variables: area, perimeter:
    methods: calculateArea(), calculatePerimeter()
 */
public class Shape {
    public double area;
    public double perimeter;

    public void calculateArea(){
        area = 0; // because right now we don't know what will be the shape;
        System.out.println("Area of the shape: "+ area);
    }
    public void calculatePerimeter(){
        perimeter = 0;  // because right now we don't know what will be the shape;
        System.out.println("Perimeter of the shape: "+ perimeter);
    }

}
