package Array;

import java.util.Scanner;

public class Array_MatrixSum {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Elements In First Array Matrix");
        for (int i =0;i<a.length;i++)
        {
            for (int j =0;j<a.length;j++)
            {
               a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter Elements In Second Array Matrix");
        for (int i =0;i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("First Array Matrix \n");
        for (int i =0;i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Second Array Matrix \n");
        for (int i =0;i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Sum of The Two Matrix \n");
        for (int i =0;i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                c[i][j]= a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
