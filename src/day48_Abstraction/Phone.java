package src.day48_Abstraction;
/*
1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
 */
public abstract class Phone {
   public static String brand;
   public String model;
   public double price;
   public String size;

    public abstract void calling(long number);
    public abstract void texting(long number);

    public String toString(){
        return "Brand: "+ brand + ", Model: "+model+", Price : $"+price + ", Size: "+size;
    }
}
