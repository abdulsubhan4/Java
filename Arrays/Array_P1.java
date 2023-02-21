package Array;

import java.util.Scanner;

public class Array_P1 {
    public static void main(String[] args) {
        int size, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array : =  ");
        size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter The Values Inside The Array : =  ");
        for (i=0;i<size;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Printed Array Elements Are : = ");
        for (i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
