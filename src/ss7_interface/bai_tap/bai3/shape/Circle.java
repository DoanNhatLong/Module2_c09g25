package ss7_interface.bai_tap.bai3.shape;

import ss7_interface.bai_tap.bai3.widen.Resizeable;

public class Circle extends Shape implements Resizeable {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = resize(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double resize(double input) {
        return input*2;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Bán kính" + getRadius() + "Area:" + getArea();
    }
}
