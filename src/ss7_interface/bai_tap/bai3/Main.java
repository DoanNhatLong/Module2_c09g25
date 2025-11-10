package ss7_interface.bai_tap.bai3;

import ss7_interface.bai_tap.bai3.shape.Circle;
import ss7_interface.bai_tap.bai3.shape.Square;

public class Main {

    public static void main(String[] args) {
        Square test=new Square(5);
        System.out.println(test.toString());
        test.howToColor();
    }
}
