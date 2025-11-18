package ss10_vehicle.service;

import ss10_vehicle.entity.Vehicle;

public interface IVehicleService {
    void deleteVehicleById(String id);
    void findVehicleById(String id);
    void addVehicle(Vehicle temp);
    void displayVehicle(int i);

}
