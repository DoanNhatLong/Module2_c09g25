package ss6_inheritance.thuc_hanh;

public class ThucHanh {
    public static class Shape {
        String color = "green";
        boolean filled = true;

        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A shape of color " + getColor() + "and"
                    + (isFilled() ? "filled" : "No filled");
        }
    }

    public static class Circle extends Shape {
        double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filter) {
            super(color, filter);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(getRadius(), 2);
        }

        public double getPerimeter() {
            return 2 * Math.PI * getRadius();
        }

        @Override
        public String toString() {
            return "A Circle with radius" + getRadius()
                    + "which is a subclass of" + super.toString();
        }
    }

    public static class Rectangle extends Shape {
        double width = 1.0;
        double length = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
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

        public double getArea() {
            return getLength() * getWidth();
        }

        public double getPerimeter() {
            return (getLength() + getWidth()) * 2;
        }

        public String toString() {
            return "A Rectangle with width" + getWidth() + "and length" + getLength()
                    + "which is a subclass of" + super.toString();
        }
    }

    public static class Square extends Rectangle {
        public Square(){
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled){

        }

        public void setWidth(double side){
            super.setWidth(side);
        }

        public void setLength(double side){
            super.setLength(side);
        }

        public double getSide(){
            return getWidth();
        }

        public void setSide(double side){
            setWidth(side);
            setLength(side);
        }

        public String toString(){
         return "A Square with side:" + getSide()
                 + "which is a subclass of" + super.toString();
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }

}
