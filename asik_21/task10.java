package asik_21;

import java.util.Scanner;

public class task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        multiArray = new int[s][];
        for (int i = 0; i < s; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
        for (int[] row : multiArray) {
            System.out.println(java.util.Arrays.toString(row));
        }

        scanner.close();
    }
}
