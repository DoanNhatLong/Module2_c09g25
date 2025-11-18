package ss10_vehicle.repository;

import ss10_vehicle.entity.Vehicle;

public interface IVehicleRepository {
    void deleteVehicle(String id);
    void findVehicle(String id);
    void addVehicle(Vehicle temp);
    void displayVehicle(int i);
}
