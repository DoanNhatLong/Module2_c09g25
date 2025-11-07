package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Random;

public class Bai5 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(array));

        int max = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println(max);
    }

}
