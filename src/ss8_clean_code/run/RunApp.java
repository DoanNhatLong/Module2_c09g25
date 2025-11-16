package ss8_clean_code.run;

import ss8_clean_code.controller.VehicleController;
import ss8_clean_code.view.VehicleView;
import static ss8_clean_code.repository.RepositoryVehicle.vehicleList;


public class RunApp {
    public static void main(String[] args) {
//        VehicleView.displayVehicle(vehicleList);
        VehicleController.displayMenu();
    }
}
