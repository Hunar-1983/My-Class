package src.day29_Wrapper_ArrayList;

import java.util.ArrayList;

/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
public class WarmupTasks {
    public static void main(String[] args) {
        String input = "a1b2c3";
        String num = "0123456789";
        int sum = 0;

        for (int i =0; i < input.length(); i++){
            for (int k =0; k < num.length(); k++){
                if (input.charAt(i) == num.charAt(k)){
                    int n = Integer.parseInt(input.charAt(i)+"");
                    sum += n;
                }
            }
        }
        System.out.println(sum);

        /*
        2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1

         */
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

/*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
 */
        int [] array = {1, 1, 2, 3, 3, 4, 5};
        ArrayList<Integer> unique = new ArrayList<>();
        int count ;
        for (int i = 0; i < array.length; i++){
            count =0;
            for (int k =0; k < array.length; k++){
                if (array[i] == array[k]){
                    count++;
                }
            }
            if (count == 1){
                unique.add(array[i]);
            }
        }
        System.out.println(unique);

    /*
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

        String [] ara1 = {"A", "B", "C"};
        String [] ara2 = {"D", "E", "F", "G"};

        ArrayList<String> list1 = new ArrayList<>();
        for (int i =0; i < ara1.length; i++){
            list1.add(ara1[i]);
        }
        for (int k =0; k < ara2.length; k++){
            list1.add(ara2[k]);
        }
        System.out.println(list1);

        /*
         4.	write a program that can find the unique elements from an ArrayList of integers
          and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   list2.add(1);   list2.add(2);   list2.add(3);   list2.add(3);
        list2.add(4);   list2.add(5);
        ArrayList<Integer> list3 = new ArrayList<>();

        for (Integer each : list2){
            int count2 = 0;
            for (Integer each2 : list2){
                if (each == each2){
                    count2++;
                }
            }
            if (count2 == 1){
            list3.add(each);
        }}
        System.out.println(list3);

    }
}
