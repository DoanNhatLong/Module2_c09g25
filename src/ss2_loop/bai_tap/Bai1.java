package ss2_loop.bai_tap;

public class Bai1 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int max= 100;
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
