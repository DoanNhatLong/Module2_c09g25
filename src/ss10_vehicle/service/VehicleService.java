package ss10_vehicle.service;

import ss10_vehicle.entity.Vehicle;
import ss10_vehicle.repository.IVehicleRepository;
import ss10_vehicle.repository.VehicleRepository;

public class VehicleService implements IVehicleService {
    IVehicleRepository repo = new VehicleRepository();

    @Override
    public void deleteVehicleById(String id) {
        repo.deleteVehicle(id);
    }

    @Override
    public void findVehicleById(String id) {
        repo.findVehicle(id);
    }

    @Override
    public void addVehicle(Vehicle temp) {
        repo.addVehicle(temp);
    }

    @Override
    public void displayVehicle(int i) {
        repo.displayVehicle(i);

    }
}
