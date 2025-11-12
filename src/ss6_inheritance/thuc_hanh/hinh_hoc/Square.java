package ss6_inheritance.thuc_hanh.hinh_hoc;

public class Square extends Rectangle {


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
