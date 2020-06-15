package src.day49_Polymorphisim;
/*
 1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */
interface downloadable{
    boolean downloadable = true;  // by default in interface variable will be public & static & final
    void downloadable();   // by default this method is public & abstract

}

interface AndroidApps extends downloadable{  // we have in this interface 1 abstract method & 2 variable
    String AppStoreName = "Android";   // by default in interface variable will be public & static & final
}

interface AppleApps extends downloadable{   // we have in this interface 1 abstract method & 2 variable
    String AppStoreName = "Apple";    // by default in interface variable will be public & static & final
}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "brand= " + brand + ", model= " + model + ", price= " + price + ", size= " + size;
    }

}
