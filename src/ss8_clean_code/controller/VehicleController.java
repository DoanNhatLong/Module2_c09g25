package ss8_clean_code.controller;

import ss8_clean_code.entity.Vehicle;
import ss8_clean_code.service.IVerhicleService;
import ss8_clean_code.service.VehicleService;
import ss8_clean_code.view.VehicleView;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {
    public static void displayMenu(){
        IVerhicleService verhicleServicle=new VehicleService();
        final int ADD=1;
        final int DISPLAY=2;
        final int DELETE=3;
        final int FIND=4;
        final int EXIT=5;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("------Quanr lý phương tiện----");
            System.out.println("Chọn chức năng");
            System.out.println("""
                    1. Thêm
                    2. Hiển thị
                    3. Xóa
                    4. Tìm kiếm
                    5. Thoát""");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD-> {
                    VehicleView.inputDataForVehicle();
                }
                case DELETE -> {
                    VehicleView.deleteByID();
                }

                case FIND -> {
                    VehicleView.findByID();

                }

                case DISPLAY ->{
                    ArrayList<Vehicle> vehicleArrayList=VehicleService.findAll();
                    VehicleView.displayVehicle(vehicleArrayList);
                }
                case EXIT -> {
                    return ;
                }
            }
        }
    }
}
