package src.day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook();
        ebook1.title = "Hamlet";
        ebook1.author = "shakespeare";
        ebook1.price = 20;

        ebook1.size = "1.5MB";
        ebook1.pages = 432;

        System.out.println(ebook1);
        System.out.println("Size "+ebook1.size);
        System.out.println("Pages: "+ebook1.pages);

        ebook1.readbook();

        System.out.println("=========================");

        AudioBook book2 = new AudioBook();
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 30;
        book2.length = "9 hours and 3 minutes";

        System.out.println(book2);
        System.out.println("Length of the audioBook: \""+book2.title+"\" is "+book2.length);

        book2.listen();


    }
}
