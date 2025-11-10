package ss4_class.bai_tap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lân lượt nhập a,b,c");
        a = Double.parseDouble(sc.nextLine());
        b = Double.parseDouble(sc.nextLine());
        c = Double.parseDouble(sc.nextLine());
        Calculate equation = new Calculate(a, b, c);
        if (equation.getA() == 0) {
            if (equation.getB() == 0) {
                if (equation.getC() == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println(equation.getC() / equation.getB());
            }
        } else if (equation.getDelta() != 0) {
            System.out.println(equation.getRoot1());
            System.out.println(equation.getRoot2());
        } else if (equation.getDelta() == 0) {
            System.out.println(equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghệm");
        }
    }
}

