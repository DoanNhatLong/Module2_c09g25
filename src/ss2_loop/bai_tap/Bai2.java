package ss2_loop.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ rộng muốn tạo");
        int size=sc.nextInt();
        for (int i = 1; i <=size ; i++) {
            System.out.println(" ".repeat(size-i)+ "*".repeat(i));
        }
    }
}
