package Array;

import java.util.Scanner;

public class Array_Reverseorder {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Elements ");
       for (int i=0;i<a.length;i++){
           a[i] = s.nextInt();
       }
        System.out.println("Array Elements");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] +" ");
        }
        System.out.println("Array Length "+ a.length);
        System.out.println("Array Reverse Elements");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i] +" ");
        }
    }
}
