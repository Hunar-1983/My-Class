package src.day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.sun.javaws.jnl.LibraryDesc;
import resources.Library;

public class Test {
    public static void main(String[] args) {
        String str = "Hunar";
       String reverse = Library.Reverse(str);
        System.out.println(reverse);

        int [] arr = {5, 9, 10, 3, 2, -1};
       arr = Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
