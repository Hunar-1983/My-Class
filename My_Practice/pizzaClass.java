package My_Practice;

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
}