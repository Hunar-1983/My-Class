package src.My_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class wewe {
    public static void main(String[] args) {

        ArrayList<Integer> list1 =  new   ArrayList<>( );
        list1.addAll(Arrays.asList(4,12,3,4,60,60,7,40,50,50, 50));
        Integer max1 = Collections.max(list1);
        for (int i=0; i < list1.size(); i++){
            list1.remove(max1);
        }
        int max2 = Collections.max(list1);
        System.out.println("Second max number is: "+max2);




    }
        }





