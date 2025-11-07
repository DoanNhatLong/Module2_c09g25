package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        var array = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột bạn muốn cộng (index) (<=3)");
        var number = sc.nextInt();
        var total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][number];
        }
        System.out.println(total);
    }
}
