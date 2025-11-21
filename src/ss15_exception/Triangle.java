package ss15_exception;

import java.util.Arrays;

import static ss10_vehicle.controller.VehicleController.sc;

public class Triangle {
    public static void main(String[] args) {

        try {
            System.out.println("Nhập vào cạnh a của tam giác");
            double a = sc.nextDouble();
            System.out.println("Nhập vào cạnh b của tam giác");
            double b = sc.nextDouble();
            System.out.println("Nhập vào cạnh c của tam giác");
            double c = sc.nextDouble();
            boolean temp = check(a, b, c);
            System.out.println(temp);
        } catch (TriangleException e) {
            System.out.println("Nhập sai");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sai định dạng");
        }
        System.out.println("check");
    }

    public static boolean check(double a, double b, double c) throws TriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            throw new TriangleException();
        }
    }
}
