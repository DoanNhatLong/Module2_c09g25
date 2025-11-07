package ss3_array.bai_tap;

import java.util.Arrays;

public class Bai8 {
    public static void main(String[] args) {
        var array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(array));
        var total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        System.out.println(total);
    }
}
