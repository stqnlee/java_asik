package asik_22;
public class task5_22 {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = { 11, 22, 33, 44, 55, 55, 66, 77, 88, 99 };
        printArray(array);
        reverseArray(array);
        printArray(array);
    }    
}
