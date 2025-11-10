package ss4_class.bai_tap.bai1;

public class Calculate {
    double a;
    double b;
    double c;

    public Calculate() {
    }

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


    public double getDelta() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDelta())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDelta())) / (2 * getA());
    }

}
