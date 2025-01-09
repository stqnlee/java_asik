package asik_21;

import java.util.Scanner;

public class task7 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];

        System.out.println("Enter 6 strings:");
        for (int i = 0; i < 6; i++) {
            strings[i] = sc.nextLine();
        }
        sc.close();

        for (int i = 0; i < 6; i++) {
            if (strings[i] == null) continue;
            for (int j = i + 1; j < 6; j++) {
                if (strings[j] != null && strings[i] != null && strings[i].equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
