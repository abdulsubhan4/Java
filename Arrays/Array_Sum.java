package Array;

import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("Addition of Elements "+sum);
    }
}
