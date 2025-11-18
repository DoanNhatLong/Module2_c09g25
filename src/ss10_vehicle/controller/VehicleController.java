package ss10_vehicle.controller;

import ss10_vehicle.service.IVehicleService;
import ss10_vehicle.service.VehicleService;
import ss10_vehicle.view.InputData;


import java.util.Scanner;

public class VehicleController {
    public static final Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        IVehicleService vehicleService = new VehicleService();
        final int ADD = 1;
        final int DISPLAY = 2;
        final int DELETE = 3;
        final int FIND = 4;
        final int EXIT = 5;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------Quanr lý phương tiện----");
            System.out.println("Chọn chức năng");
            System.out.println("""
                    1. Thêm
                    2. Hiển thị
                    3. Xóa
                    4. Tìm kiếm
                    5. Thoát""");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ADD -> {
                    vehicleService.addVehicle(InputData.inputVehicle());
                }
                case DELETE -> {
                    System.out.println("Nhập vào ID");
                    String id = sc.nextLine();
                    vehicleService.deleteVehicleById(id);
                }

                case FIND -> {
                    System.out.println("Nhập vào ID");
                    String id = sc.nextLine();
                    vehicleService.findVehicleById(id);
                }

                case DISPLAY -> {
                    vehicleService.displayVehicle(InputData.inputType());
                }
                case EXIT -> {
                    return;
                }
            }
        }
    }
}
