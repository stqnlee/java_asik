package asik_21;

public class task2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i == 0 || i % 2 == 0) {
                strings[i] = EVEN;
            }
            else {
                strings[i] = ODD;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Index: " + i + " = "+ strings[i]);
        }
    }
}
