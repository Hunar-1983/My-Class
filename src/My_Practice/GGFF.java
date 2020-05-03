package src.My_Practice;

public class GGFF {
    public static void main(String[] args) {

        String word = "2322jk4g5jhg46gh";

        char[] ch = word.toCharArray();
        String letter = "";
        String number = "";

        for (char each : ch){
           if (Character.isDigit(each)) number += each;
           else letter+= each;
        }
        System.out.println(number+"\n"+letter);

        System.out.println("+++++++++++++");

        String let = "";
        String num = "";

        for (int i =0; i < ch.length; i++){
            if (Character.isDigit(ch[i])) num += ch[i];
            else let += ch[i];
        }
        System.out.println(num+"\n"+let);



    }

}