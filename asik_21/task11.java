package asik_21;

public class task11 {
    public static int[][][][] multiArray = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}}};

    public static void main(String[] args) {
        for (int[][][] fourDArr : multiArray) {
            for (int[][] threeDArr : fourDArr) {
                for (int[] twoDArr : threeDArr) {
                    for (int num : twoDArr) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
