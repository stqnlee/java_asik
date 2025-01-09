package asik_21;

import java.util.Scanner;

public class task6 {
    public static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        if (n > 0) {
            array = new int[n];
            int maxNum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            sc.close();

            for (int i = 0; i < n; i++) {
                if (array[i] > maxNum) {
                    maxNum = array[i];
                }
            }

            System.out.println(maxNum);
        }
    }
}
