package ss7_interface.bai_tap.bai3;

import ss6_inheritance.thuc_hanh.hinh_hoc.Circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle [] test=new Circle[3];
        test[0] = new Circle(4);
        test[1] = new Circle();
        test[2] = new Circle("red",false,10);
        ComparatorCircle circle=new ComparatorCircle();
        Arrays.sort(test,circle);
        for (Circle item : test) {
            System.out.println(item);
        }
    }
}
