package asik_21;

import java.util.Scanner;

public class task16 {
    public static char[][] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = sc.nextInt();
        sc.close();

        int width = 2 * height - 1;
        array = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int middle = width / 2; 
                if (j >= middle - i && j <= middle + i) {
                    array[i][j] = '#'; 
                } else {
                    array[i][j] = ' '; 
                }
            }
        }

        printArray();
    }

    private static void printArray() {
        for (char[] row : array) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
