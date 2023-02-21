package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Static {
    public static void main(String[] args) {
        String a[] = {"Mohammad","Abdul","Subhan","Javad"};
        System.out.println("To String" +Arrays.toString(a));
         System.out.println("As List" +Arrays.asList(a));
         int a2 [][] = {{10,20},{30,40}};
        System.out.println("Deep To String" + Arrays.deepToString(a2));
    }
}
