package ss10_vehicle.view;

import ss10_vehicle.entity.Motorbike;
import ss10_vehicle.entity.Oto;
import ss10_vehicle.entity.Truck;
import ss10_vehicle.entity.Vehicle;

import static ss10_vehicle.controller.VehicleController.sc;

public class VehicleView {
    public static Vehicle inputVehicle() {
        int type = VehicleView.inputType();
        System.out.println("Nhập name");
        String name = sc.nextLine();
        System.out.println("Nhập năm");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập id");
        String id = sc.nextLine();
        System.out.println("Nhập chủ");
        String owner = sc.nextLine();
        switch (type) {
            case 1 -> {
                System.out.println("Nập tải trọng");
                int temp = Integer.parseInt(sc.nextLine());
                return new Truck(name, year, id, owner, temp);
            }
            case 2 -> {
                System.out.println("Nhập công suất");
                int temp = Integer.parseInt(sc.nextLine());
                return new Motorbike(name, year, id, owner, temp);
            }
            case 3 -> {
                System.out.println("Nhập chỗ ngồi ");
                int temp1 = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập kiểu");
                String temp2 = sc.nextLine();
                return new Oto(name, year, id, owner, temp1, temp2);
            }
        }
        return null;
    }

    public static int inputType() {
        while (true) {
            System.out.println("---Chọn phương tiên---");
            System.out.println("""
                    1. Xe tải
                    2. Xe máy
                    3. Xe oto
                    4. Trở về menu chính""");
            int temp = Integer.parseInt(sc.nextLine());
            if (temp == 1 | temp == 2 | temp == 3) {
                return temp;
            } else if (temp == 4) {
                return 0;
            }

        }

    }

}
