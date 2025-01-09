package asik_22;
public class task11_22 {
    public static void printSqrt(int[] array) {
        String s = "The square root for the number ";
        for (int i = 0; i < array.length; i++) {
            int under_root = array[i]; 
            double sqrt = Math.sqrt(under_root); 
            System.out.println(s + under_root + " is " + sqrt);
        }
    }
    public static void main(String[] num) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }
}
