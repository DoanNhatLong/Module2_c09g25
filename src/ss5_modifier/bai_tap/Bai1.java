package ss5_modifier.bai_tap;

public class Bai1 {
    public static class Circle{
        private double radius=1.0;
        private String color="red";
        public Circle(){
        }
        public Circle(double radius){
            this.radius=radius;
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
            return Math.PI*getRadius()*getRadius();
        }

    }
    public static void main(String[] args) {
        Circle test=new Circle(10);
        System.out.println("Radius:" + test.getRadius() + "Area:" + test.getArea());
    }
}

