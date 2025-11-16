package ss8_clean_code.service;


import ss8_clean_code.entity.Vehicle;
import ss8_clean_code.repository.IRepositoryVehicle;
import ss8_clean_code.repository.RepositoryVehicle;

import java.util.ArrayList;


public class VehicleService implements IVerhicleService {
    IRepositoryVehicle vehicleList=new RepositoryVehicle();


    public static ArrayList<Vehicle> findAll() {
        return RepositoryVehicle.findAll();
    }

    @Override
    public void addVehicle(Vehicle item) {
        vehicleList.getList().add(item);
    }

    
}
