package Array;

import java.util.Scanner;

public class Array_avrg {
    public static void main(String[] args) {
        int a[] = new int[5];int sum =0;double avg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Array Elements");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Average of Elements");
        for (int i=0;i<a.length;i++){
            sum = a[i]+sum;
        }
        avg=sum/a.length;
        System.out.println("\nAddition " +sum+"\nAverage "+avg);
    }
}
