package src.day49_Polymorphisim;

public final class iphone extends Phone implements AppleApps{ // we give final keyword coz ti's not be able to be superclass for any other class later!
    static {
        brand = "Apple";
    }

    public iphone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
    @Override
    public void downloadable() {
        System.out.println( "iphone is downloading apps from "+ AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iphone is texting to "+ phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iphone is calling to "+ phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iphone is face timing to "+ phoneNumber);
    }

    public void selfie(){
        System.out.println("iphone takes a great selfie");
    }

}
