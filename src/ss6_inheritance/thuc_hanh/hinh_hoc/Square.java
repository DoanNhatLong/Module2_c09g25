package ss6_inheritance.thuc_hanh.hinh_hoc;

import ss7_interface.bai_tap.bai1.Resizeable;
import ss7_interface.bai_tap.bai2.Colorable;

public class Square extends Rectangle implements Colorable, Resizeable {

    @Override
    public void howToColor() {
        System.out.println("Color all four size");
    }

    @Override
    public void resizeShape(double percent) {
        System.out.println("Ban đầu" + getSide());
        setSide(getSide()*(100+percent)/100);
        System.out.println("Sau thay đổi" + getSide());
    }

    public Square() {
        super(1.0, 1.0);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side" + getSide()
                + "which is a subclass of" + super.toString();
    }
}
