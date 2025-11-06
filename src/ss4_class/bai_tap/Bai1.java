package ss4_class.bai_tap;

import java.util.Scanner;

public class Bai1 {
    public class Calculate {
        private double a;
        private double b;
        private double c;

        public Calculate(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }


        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public boolean checkFirst() {
            if (getA() == 0) {
                if (getB() == 0) {
                    if (getC() == 0) {
                        System.out.println("Vô số nghiệm");
                    } else {
                        System.out.println("Vô nghiệm");
                    }
                } else {
                    double temp = -getB() / getC();
                    System.out.println(temp);
                }
                return false;
            } else {
                return true;
            }
        }

        public double getDelta() {
            return getB() * getB() - 4 * getA() * getC();
        }

        public double getRoot1() {
            return (-getB() + Math.sqrt(getDelta())) / 2 * getA();
        }

        public double getRoot2() {
            return (-getB() - Math.sqrt(getDelta())) / 2 * getA();
        }

    }


    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Calculate test = new Calculate(a, b, c);
        if (test.checkFirst()) {
            if (test.getDelta() > 0) {
                System.out.println(test.getRoot1());
                System.out.println(test.getRoot2());
            } else if (test.getDelta() == 0) {
                System.out.println(test.getRoot1());
            } else {
                System.out.println("Phuonwg trình vô nghiệm");
            }
        }

    }
}
