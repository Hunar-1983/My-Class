package src.day26_MethodOverloading;
/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
             2. use the above method to create another called uniques that accepts a string paramter
     and returns it's unique characters as String
 */
public class WarmUpTasks {
    public static void main(String[] args) {

        String str = "AAA";
        char ch = 'A';
        System.out.println(  frequency("AAA", 'A')   );

        String str2 = "SSSIOOHH";
        System.out.println(   Unique("SSSIOOHH")  );
    }

    public static int frequency (String str, char ch){

            char [] arr = str.toCharArray(); // ['A', 'A', 'A'];
            int count =0;
            for (char each : arr){
                if (each == ch) count++;
            }
            return count;
        }

        public static String Unique (String str2){

        String nonDop = "";
        for (int i =0; i < str2.length(); i++){
            if (!nonDop.contains(str2.charAt(i)+"")){
                nonDop += str2.charAt(i);
            }
        }
        return nonDop;
    }
    }


