package My_Practice;
/*
class pizzaClass {
    String size;
    int cheese;
    int pepperoni;

    public void customizeOrder(String pizaSize, int pizaCheese, int pizaPepperoni){
        size = pizaSize;
        cheese = pizaCheese;
        pepperoni = pizaPepperoni;
    }
    public double calcCost(){
        double sum = 0;

        if (size.equals("small")) sum += 10;
        else if (size.equals("medium")) sum += 12;
        else if (size.equals("large")) sum += 14;

        sum += cheese * 1;
        sum += pepperoni * 1.5;

        return sum;
    }

    public String toString(){
        return  "Piza size is "+ size+ "\ncheese is "+cheese+"\npepperoni is "+pepperoni+"\ntotal price is "+calcCost();
 */

  class carpet {
      int width;
      int length;
      double unitPrice;
      boolean isPersian;

      public void customOrder(int widthCarPet, int lengthCarPet, double unitPriceCarPet, boolean isPersian){
          width = widthCarPet;
          length = lengthCarPet;
          unitPrice = unitPriceCarPet;

      }
      public double calcCost(){
          double totalPrice = (width+length)*unitPrice;
           if (isPersian == false)
               totalPrice += 200;
           return totalPrice;
      }

      public String toString (){
          return "Length car pet is "+length+"\nWidth car pet is "+width+"\nTotal price is "+calcCost();
      }

        }