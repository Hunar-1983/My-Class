package day23_methods;

public class method_OddNumber {
    public static void main(String[] args) {
       OddNumber();
        System.out.println();
       EvenNumber();
    }

    public  static void OddNumber(){
        for (int i = 0; i <=100; i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }

    public  static void EvenNumber(){
        for (int i = 0; i <=100; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}




