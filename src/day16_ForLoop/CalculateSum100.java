package src.day16_ForLoop;
/*
write a program that can calculate the sum of all
the even && ODD numbers between 1 ~ 100
 */
public class CalculateSum100 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <=100; i++){
            if (i % 2 ==0){
                sum1 +=i;
            } else{
                sum2 += i;
            }
        }
        System.out.println("sum of all even number: "+sum1);
        System.out.println("sum of all odd number: "+sum2);


    }
}
