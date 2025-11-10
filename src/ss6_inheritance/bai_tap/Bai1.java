package ss6_inheritance.bai_tap;

public class Bai1 {
    public static Circle test1=new Circle();
    public static Cylinder test2=new Cylinder(5,10,"Red");

    public static void main(String[] args) {
        System.out.println(test2.toString());
    }

    public static class Circle{
        double radius;
        String color;
        public Circle(){
        }
        public Circle(double radius,String color){
            this.radius=radius;
            this.color=color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea(){
            return Math.PI*Math.pow(getRadius(),2);
        }

        public String toString(){
            return "Bán kính" + getRadius() + "Màu:" +getColor();
        }

    }
    public static class Cylinder extends Circle{
        double height;
        public Cylinder(){
        }

        public Cylinder(double height, double radius, String color){
            super(radius, color);
            this.height=height;
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

        public String toString(){
            return super.toString() + "Chiều cao" + getHeight() + "Thể tích" +getVolume() ;
        }
    }
}
