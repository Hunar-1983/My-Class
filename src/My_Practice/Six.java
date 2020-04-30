package src.My_Practice;

import src.Important.Array;

import java.util.*;

public class Six {
    public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<>();
         nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        ArrayList<Integer> a = timesTwo(nums);
        System.out.println(a);
    }



    public static ArrayList<Integer> timesTwo (ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : nums){
            each *= 2;
            list.add(each);
        }
        list.clear();
        return list;
    }




}

