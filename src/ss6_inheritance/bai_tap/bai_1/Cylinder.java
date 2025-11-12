package ss6_inheritance.bai_tap.bai_1;

public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + "Chiều cao " + getHeight();
    }
}
