package ss7_interface.bai_tap.bai3.shape;

import ss7_interface.bai_tap.bai3.widen.Resizeable;

public class Reactangle extends Shape implements Resizeable {
    double width;
    double length;
    public Reactangle(){
    }
    public Reactangle(double width, double length){
        this.width=resize(width);
        this.length=resize(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public String toString() {
        return "Chiều dài là" + getLength() + "Diện tích là" + getArea();
    }

    @Override
    public double resize(double input) {
        return input*1.5;
    }
}
