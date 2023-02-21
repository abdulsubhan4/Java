package Array;

import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        int a[] = new int[5];int n;int count =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter Search Element");
        n = s.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0) {
            System.out.println("Item Found "+count+" times");
        }
        else {
            System.out.println("Item Not Found");
        }

    }
}
