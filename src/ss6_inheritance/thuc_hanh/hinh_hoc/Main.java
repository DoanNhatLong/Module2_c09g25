package ss6_inheritance.thuc_hanh.hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5.0);
        Rectangle rec=new Rectangle(7,8);
        Square square=new Square("red",false,10);
        System.out.println(circle.getArea() +"\n" +rec+ "\n"
                +square);
    }
}
