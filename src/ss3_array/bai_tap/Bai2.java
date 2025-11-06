package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn thêm");
        int number = sc.nextInt();
        System.out.print("Nhập index bạn muốn thêm");
        int index = sc.nextInt();
        int temp=array[index];
        for (int i = array.length-1; i >= index ; i--) {
            array[i]=array[i-1];
        }
        array[index]=number;
        System.out.println(Arrays.toString(array));
    }
}
