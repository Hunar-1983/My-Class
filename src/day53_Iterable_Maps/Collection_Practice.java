package src.day53_Iterable_Maps;
/*
warmup tasks:
	1. write a program that remove the duplicates fron an array of String
	2. write a program that can remove the duplicates from an arrayList of String
	3. what are the differences between List and Set
			List: Accepts duplicates
			Set:
	4. how to achieve thread safety
 */
import java.util.*;

public class Collection_Practice {

/*
    access-modifiers  specifier  return-type  methodsName(Parameter)
        specifiers: static, final, abstract, synchronized
     */

        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            list = Collections.synchronizedList(list); // thread-safe

            Set<Integer> set = new HashSet<>();
            set = Collections.synchronizedSet(set); // thread-safe

            System.out.println("================================");

            String[] arr = {"E", "B", "A", "D", "D", "C", "A"};  //EBADC
            LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
            System.out.println(st);

       /*
        for(String each: arr){
            st.add(each);
        }
        */

            ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
            LinkedHashSet<String> st2 = new LinkedHashSet<>(arraylist);


            System.out.println(st2);

        }


        public synchronized void append(){

        }


    }