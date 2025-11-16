package ss8_clean_code.repository;

import ss8_clean_code.entity.Motorbike;
import ss8_clean_code.entity.Oto;
import ss8_clean_code.entity.Truck;
import ss8_clean_code.entity.Vehicle;

import java.util.ArrayList;

public class RepositoryVehicle implements IRepositoryVehicle {
    public static ArrayList<Vehicle> vehicleList= new ArrayList<>();
    static {
        Vehicle oto1=new Oto("BWM", 2000, "1167", "Hung", 8,"Family");
        Vehicle truck1=new Truck("Grat", 2010,"2313","Vuong", 2000);
        Vehicle bike1=new Motorbike("UIl", 2018,"1145","Vu", 2000);
        vehicleList.add(oto1);
        vehicleList.add(truck1);
        vehicleList.add(bike1);
    }

    public static ArrayList<Vehicle> findAll(){
     return vehicleList;
    }

    @Override
    public ArrayList<Vehicle> getList() {
        return vehicleList;
    }

}
