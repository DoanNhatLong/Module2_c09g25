package ss10_vehicle.repository;

import ss10_vehicle.entity.Motorbike;
import ss10_vehicle.entity.Oto;
import ss10_vehicle.entity.Truck;
import ss10_vehicle.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class VehicleRepository implements IVehicleRepository {
    public static final List<ArrayList<? extends Vehicle>> vehicleList = new ArrayList<>();
    public static final List<Truck> truckList = new ArrayList<>();
    public static final List<Oto> otoList = new ArrayList<>();
    public static final List<Motorbike> motorbikeList = new ArrayList<>();

    static {
        truckList.add(new Truck());
        motorbikeList.add(new Motorbike());
        otoList.add(new Oto());
        vehicleList.add((ArrayList<? extends Vehicle>) truckList);
        vehicleList.add((ArrayList<? extends Vehicle>) motorbikeList);
        vehicleList.add((ArrayList<? extends Vehicle>) otoList);

    }

    @Override
    public void deleteVehicle(String id) {
        boolean flag = false;
        for (ArrayList<? extends Vehicle> vehicle : vehicleList) {
            for (Vehicle vehicle1 : vehicle) {
                if (Objects.equals(vehicle1.getId(), id)) {
                    vehicle.remove(vehicle1);
                    flag = true;
                    break;
                }
            }

        }
        System.out.println(flag ? "Xóa thành công" : "Không tìm thấy");

    }


    @Override
    public void findVehicle(String id) {
        boolean flag = false;
        for (ArrayList<? extends Vehicle> vehicle : vehicleList) {
            for (Vehicle vehicle1 : vehicle) {
                if (Objects.equals(vehicle1.getId(), id)) {
                    System.out.println(vehicle1);
                    flag = true;
                }
            }
        }
        System.out.println(flag ? "Tìm  thành công" : "Không tìm thấy");

    }

    @Override
    public void addVehicle(Vehicle temp) {
        if (temp instanceof Truck t) {
            truckList.add(t);
        } else if (temp instanceof Motorbike m) {
            motorbikeList.add(m);
        } else if (temp instanceof Oto o) {
            otoList.add(o);
        }
    }


    @Override
    public void displayVehicle(int i) {
        for (Vehicle vehicle : vehicleList.get(i - 1)) {
            System.out.println(vehicle);
        }

    }
}
