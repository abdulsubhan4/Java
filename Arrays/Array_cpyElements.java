package Array;

import java.util.Scanner;

//copying one array elements to another
public class Array_cpyElements {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        System.out.println("First Array Elements ");
        for (int i=0;i<5;i++){
            System.out.println(a[i] +" ");
    }
        System.out.println("Second Array Elements ");
        for (int i=0;i<5;i++){
            b[i]=a[i];
            System.out.println(b[i] +" ");
        }
    }
}
