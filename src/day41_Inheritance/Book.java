package src.day41_Inheritance;

public class Book {
   /*
    title
    author
    price
     */

    public String title;
    public String author;
    public double price;


    public String toString(){
        return "title : "+title+", Author: "+ author+", $"+price;
    }

}
