package ss7_interface.thuc_hanh.bai2;

import ss7_interface.bai_tap.bai2.ComparableCircle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ss7_interface.bai_tap.bai2.ComparableCircle[] circle=new ss7_interface.bai_tap.bai2.ComparableCircle[3];
        circle[1]= new ComparableCircle(5.2);
        circle[0]= new ComparableCircle();
        circle[2]= new ComparableCircle("black",false,10);

        Arrays.sort(circle);
        for (ComparableCircle comparableCircle : circle) {
            System.out.println(comparableCircle);
        }
    }
}
