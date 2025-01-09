package asik_21;

import java.util.Scanner;

public class task13 {
    public static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
