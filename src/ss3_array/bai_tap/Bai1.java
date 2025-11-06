package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn xáo");
        int number = sc.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }

                array[array.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
