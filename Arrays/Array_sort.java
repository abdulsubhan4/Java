package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }
            Arrays.sort(a);
            for (int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
