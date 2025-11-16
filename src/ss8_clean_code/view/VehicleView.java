package ss8_clean_code.view;

import ss8_clean_code.entity.Truck;
import ss8_clean_code.entity.Vehicle;
import ss8_clean_code.repository.RepositoryVehicle;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class VehicleView {
    static RepositoryVehicle repositoryVehicle = new RepositoryVehicle();

    public static void displayVehicle(ArrayList<Vehicle> view) {
        for (Vehicle vehicle : view) {
            System.out.println(vehicle);
        }
    }

    public static void inputDataForVehicle() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---Chọn phương tiên---");
            System.out.println("""
                    1. Xe tải
                    2. Xe máy
                    3. Xe oto
                    4. Trở về menu chính""");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập thông tin");
                    Truck name = new Truck(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(),
                            sc.nextLine(), Integer.parseInt(sc.nextLine()));
                    repositoryVehicle.getList().add(name);
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

    public static void deleteByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID");
        String deleteID = sc.nextLine();
        boolean flag = true;
        for (Vehicle vehicle : repositoryVehicle.getList()) {
            if (Objects.equals(vehicle.getId(), deleteID)) {
                System.out.println("Có muốn xóa" + vehicle + "không ?");
                flag = false;
                if (Objects.equals(sc.nextLine(), "yes")) {
                    repositoryVehicle.getList().remove(vehicle);
                    break;
                } else return;
            }
        }
        if (flag) {
            System.out.println(" Không có id trùng");
        }
    }

    public static void findByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID");
        String findID = sc.nextLine();
        repositoryVehicle.getList().stream()
                .filter(element -> element.getId().contains(findID))
                .forEach(System.out::println);

//        for (Vehicle vehicle : repositoryVehicle.getList()){
//            if (vehicle.getId().contains(findID)){
//                System.out.println(vehicle);
//            }
//        }
    }
}
