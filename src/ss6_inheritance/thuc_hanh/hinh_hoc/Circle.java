package ss6_inheritance.thuc_hanh.hinh_hoc;

import ss7_interface.bai_tap.bai1.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    @Override
    public void resizeShape(double percent) {
        System.out.println("Ban đầu" + getArea());
        setRadius(getRadius()*(percent+100)/100);
        System.out.println("Sau khi tăng" + getArea());
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius"+getRadius()+ "which is a subclass of" + super.toString();
    }
}
