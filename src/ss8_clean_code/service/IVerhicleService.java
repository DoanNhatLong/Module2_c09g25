package ss8_clean_code.service;

import ss8_clean_code.entity.Vehicle;
import ss8_clean_code.repository.RepositoryVehicle;

import java.util.ArrayList;

public interface IVerhicleService {
     static ArrayList<Vehicle> findall(){
        return RepositoryVehicle.findAll();
    };

     void addVehicle(Vehicle item);
}
