package ss7_interface.bai_tap.bai3.shape;

import ss7_interface.bai_tap.bai3.widen.Colorable;
import ss7_interface.bai_tap.bai3.widen.Resizeable;

public class Square extends Reactangle implements Resizeable, Colorable {
    double side;
    public Square(){

    }

    public Square(double side){
        this.side=resize(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double resize(double input) {
        return super.resize(input);
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public void howToColor() {
        System.out.println( "Color 4 side");
    }

    @Override
    public String toString() {
        return "Cạnh là" + getSide() + "Diêện tích là" + getArea();
    }
}
