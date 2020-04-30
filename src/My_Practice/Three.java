package src.My_Practice;

import java.util.ArrayList;

public class Three {
    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList<>();
        wordList1.add("hi");
        wordList1.add("Hello");

        ArrayList<String> wordList2 = new ArrayList<>();
        wordList2.add("hi");
        wordList2.add("Hello");
       ArrayList<String> list  = combineAll(wordList1, wordList2);
        System.out.println(list);
    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1,
               ArrayList<String> wordList2){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < wordList1.size(); i++){
            list.add(wordList1.get(i));
        }
        for(String each : wordList2){
            list.add(each);
        }
        return list;
    }
}