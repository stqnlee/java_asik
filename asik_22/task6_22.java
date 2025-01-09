package asik_22;
public class task6_22 {
    public static void universalMethod(int year) {
        System.out.println("Current year is: " + year);
    }

    public static void universalMethod(String subject) {
        System.out.println("Your favourite subject " + subject);
    }

    public static void universalMethod(double P) {
        System.out.println("What is P? : " + P);
    }

    public static void universalMethod(boolean isIt) {
        System.out.println("The weather is hot today: " + isIt);
    }

    public static void universalMethod(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum+=array[i];
        System.out.println(sum);
    }
    public static void universalMethod(String country, int popul) {
        System.out.println("What country: " + country);
        System.out.println("Total population of this country: " + popul);
    }

    public static void universalMethod(int a, int b) {
        System.out.println("a + b is: " + a + b);
    }

    public static void universalMethod(String a, String b) {
        System.out.println("str a + str b is: " + a + b);
    }

    public static void universalMethod(String name, int age, boolean job) {
        System.out.println("Name: " + name + "Age: " + age + "Has a job: " + job);
    }

    public static void universalMethod() {
        System.out.print("Empty");
    }

    public static void main(String[] args) {
        universalMethod(2024);
        universalMethod("OOP");
        universalMethod(3.14);
        universalMethod(false);
        universalMethod(new int[]{1, 3, 44, 7, -6});
        universalMethod("Kazakhstan", 20000000);
        universalMethod(-84, 7);
        universalMethod("Hello", "World");
        universalMethod("Mark", 24, true);
        universalMethod();
    }
}
