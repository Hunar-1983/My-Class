package src.day48_Abstraction;

public class Samsung extends Phone{

    static{
        brand = "samsung"; // coz we wanna brand always will be iphone in this class;
    }

    public Samsung (String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long number) {
        System.out.println("Samsung is calling "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Samsung is texting "+number);
    }

    public void freezing( ){
        System.out.println("Samsung is freezing  when using ");
    }

}


