package Array;

import java.util.Scanner;

public class Array_assndng {
    public static void main(String[] args) {
        int a[]= new int[5];int temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array Elements");
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    temp = a[i];//temp = 30
                    a[i] = a[j];//a[0] = 15
                    a[j] = temp;//a[1] = 30
                }
            }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
