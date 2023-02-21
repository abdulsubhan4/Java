package Array;

import java.util.Scanner;

public class Array_Length {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = s.nextInt();
        int a [] = new int[size];
        System.out.println("Enter Elements in Array");
        for (int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array Elements ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Array Length "+ a.length);

    }
}
