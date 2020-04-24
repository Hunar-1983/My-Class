package src.My_Practice;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class wewe {
    public static void main(String[] args) {
    String str = "AABBCCCDDDDE";
    String unique = "";

    for (int i =0; i < str.length(); i++){
        int count =0;
        for (int h =0; h < str.length(); h++){
            if (str.charAt(i) == str.charAt(h)){
                count++;
            }
        }
        if (count == 1){
            unique+= str.charAt(i);
        }
    }
        System.out.println(unique);

        System.out.println("+++++++++++");
    String result ="";
    String nonDup = "";
    for (int i =0; i < str.length(); i++){
        if (!nonDup.contains(str.charAt(i)+"")){
            nonDup += str.charAt(i);
        }
    }
    for (int i =0; i < nonDup.length(); i++){
        int count1 =0;
        for (int h =0; h < str.length(); h++){
            if (nonDup.charAt(i) == str.charAt(h)){
                count1++;
            }
        }
        result += nonDup.charAt(i)+""+count1;
    }
        System.out.println(result);
    }
}
