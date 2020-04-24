package src.Important;

import com.sun.webkit.graphics.WCPathIterator;
import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.IconUIResource;
import java.text.DecimalFormat;
import java.util.Arrays;

public class INT {
    public static void main(String[] args) {
        String [] arr = {"A", "A", "B", "C", "C"}; // AABCC
        String unique = "";

        for (String each : arr){
            int count =0 ;
            for (String each1: arr){
                if (each.equalsIgnoreCase(each1)){
                    count++;
                }
            }
            if (count ==1){
                unique += each;
            }
        }
        System.out.println(unique);
    }

}
