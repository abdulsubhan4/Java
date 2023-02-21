package Array;

import java.util.Scanner;

public class Array_TransposeMatrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Matrix Elements ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                a[i][j] = s.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Transpose Matrix ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
