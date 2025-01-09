package asik_21;

import java.util.Scanner;

public class task15 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 9 numbers to fill the array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) { 
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("Flipped array:");
        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
