package asik_21;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            sc.close();

            System.out.println("The array is: ");

            if (n % 2 == 0) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            }
            else {
                for (int i = 0; i < n; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
