package Array;

import java.util.Scanner;

public class Array_InsertElement {
    public static void main(String[] args) {
        int size;int loc;int item;int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        size = s.nextInt();
        System.out.println("Enter Array Elements");
        int a[]=new int[size+1];
        for (i =0;i<size;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter Location of New Element");
        loc = s.nextInt();
        System.out.println("Enter New Element In The Array");
        item = s.nextInt();
        for (i=size;i>loc;i--)
        {
            a[i] = a[i-1];
        }
        a[loc] = item;
        for (i =0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
