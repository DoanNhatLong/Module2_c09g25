package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        String string = "Banh Knoa Da Nanh";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nập kí tự bạn muốn đếm ");
        char test = sc.next().charAt(0);
        sc.close();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == test) {
                count++;
            }
        }
        System.out.println(count);
    }
}
