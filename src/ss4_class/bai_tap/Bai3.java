package ss4_class.bai_tap;

public class Bai3 {
    public static class Fan {
        public final int SLOW = 1;
        public final int MEDIUM = 2;
        public final int FAST = 3;
        int speed = 1;
        boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan() {
            this.speed = SLOW;
            this.on = false;
            this.radius = 5;
            this.color = "blue";
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
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

        public String toString() {
            if (isOn()) {
                return ("fan is on speed " + getSpeed() + "radius " + getRadius() + "color " + getColor());
            } else {
                return ("fan is off radius" + getRadius() + "color " + getColor());
            }
        }
    }


    public static void main(String[] args) {
        Fan fan1= new Fan();
        Fan fan2= new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan2.toString());
        System.out.println(fan1.toString());
    }
}
