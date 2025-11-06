package ss1_java.bai_tap;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        double rate=23000;
        double usd;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập vào số tiền");
        usd=sc.nextDouble() *rate;
        System.out.print(usd);
    }
}
