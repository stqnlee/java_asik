package asik_22;
public class task10_22 {
    public static void main(String[] args) {
        int[] array = { 123, 7, -14, 67, 16, 98, 75, 576 };
        System.out.println("In array: ");
        printArray(array);
        System.out.println("Minimum number: " + getMinValue(array));
        System.out.println("Maximum number: " + getMaxValue(array));
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
}

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
