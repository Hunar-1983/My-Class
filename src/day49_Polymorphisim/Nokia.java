package src.day49_Polymorphisim;

public final class Nokia extends Phone implements downloadable {
    static {
        brand = "Nokia";
    }
    public Nokia(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
    @Override
    public void downloadable() {
        System.out.println("Nokia is downloading apps from ");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("");
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("");
    }

}
