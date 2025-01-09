package asik_21;

public class task12 {
    public static int[][] arr = new int[2][3];

    public static void main(String[] args) {
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }
        for (int[] row : arr) {
            for (int element : row) {
                System.out.println(element);
            }
        }
    }
}
