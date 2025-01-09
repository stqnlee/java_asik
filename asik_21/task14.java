package asik_21;

import java.util.Scanner;

public class task14 {
    public static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] rowSums = new int[3];
        int[] columnSums = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += arr[i][j];
                columnSums[j] += arr[i][j];
            }
        }
        int minSum = Integer.MAX_VALUE;

        for (int sum : rowSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }

        for (int sum : columnSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);
        scanner.close();
    }
}
