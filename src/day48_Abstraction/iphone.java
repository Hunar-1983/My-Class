package src.day48_Abstraction;

public class iphone extends Phone{

    static {
        brand = "iphone";  // coz we wanna brand always will be iphone in this class;
    }

    @Override
    public void calling(long number) {
        System.out.println("Iphone is calling with "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Iphone is texting "+number);
    }

    public void faceTiming(long number){  // this method is unique just fore iphone;
        System.out.println("Iphone is face timing "+number);
    }

    public iphone (String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
}
