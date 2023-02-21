package Array;

public class Array_P3 {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        int sum = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<i+1;j++){
                a[i][j] = i+1;
            }
        }
        for (int i=0;i<3;i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}
