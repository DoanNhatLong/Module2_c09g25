package ss10_vehicle.repository;

import ss10_vehicle.entity.Motorbike;
import ss10_vehicle.entity.Oto;
import ss10_vehicle.entity.Truck;
import ss10_vehicle.entity.Vehicle;
import ss10_vehicle.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class VehicleRepository implements IVehicleRepository {

    private final String VEHICLE_FILE = "ss10_vehicle/data/vehicle.csv";


    @Override
    public void deleteVehicle(String id) {
        List<Vehicle> vehicleList = getAll();
        boolean flag = false;
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getId(), id)) {
                vehicleList.remove(vehicle);
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Xóa thành công" : "Không tìm thấy");
        List<String> stringList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle instanceof Truck t) {
                stringList.add(t.toCSV());
            } else if (vehicle instanceof Motorbike m) {
                stringList.add(m.toCSV());
            } else if (vehicle instanceof Oto o) {
                stringList.add(o.toCSV());
            }
        }
        ReadAndWriteFile.write(VEHICLE_FILE, stringList, false);
    }

    @Override
    public void findVehicle(String id) {
        List<Vehicle> vehicleList = getAll();
        boolean flag = false;
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getId(), id)) {
                System.out.println(vehicle);
                flag = true;
            }
        }
        System.out.println(flag ? "Tìm  thành công" : "Không tìm thấy");

    }

    @Override
    public void addVehicle(Vehicle temp) {
        List<String> stringList = new ArrayList<>();
        if (temp instanceof Truck t) {
            stringList.add(t.toCSV());
        } else if (temp instanceof Motorbike m) {
            stringList.add(m.toCSV());
        } else if (temp instanceof Oto o) {
            stringList.add(o.toCSV());
        }
        ReadAndWriteFile.write(VEHICLE_FILE, stringList, true);
    }

    @Override
    public void displayVehicle(int i) {
        List<Vehicle> vehicleList = getAll();
        for (int j = 0; j < vehicleList.size() ; j++) {

        }
//        for (Vehicle vehicle : vehicleList) {
//            switch (i) {
//                case 1 -> {
//                    if (vehicle instanceof Truck) {
//                        System.out.println(vehicle);
//                    }
//                }
//                case 2 -> {
//                    if (vehicle instanceof Motorbike) {
//                        System.out.println(vehicle);
//                    }
//                }
//                case 3 -> {
//                    if (vehicle instanceof Oto) {
//                        System.out.println(vehicle);
//                    }
//                }
//            }
//        }
    }

    @Override
    public List<Vehicle> getAll() {
        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(VEHICLE_FILE);
        List<Vehicle> vehicleList = new ArrayList<>();
        for (String string : stringList) {
            String[] arr = string.split(",");
            switch (arr[0]) {
                case "Truck" -> vehicleList.add(new Truck(arr[1], Integer.parseInt(arr[2]),
                        arr[3], arr[4], Integer.parseInt(arr[5])));
                case "Motorbike" -> vehicleList.add(new Motorbike(arr[1], Integer.parseInt(arr[2]),
                        arr[3], arr[4], Integer.parseInt(arr[5])));
                case "Oto" -> vehicleList.add(new Oto(arr[1], Integer.parseInt(arr[2]),
                        arr[3], arr[4], Integer.parseInt(arr[5]), arr[6]));
            }
        }
        return vehicleList;
    }
}
