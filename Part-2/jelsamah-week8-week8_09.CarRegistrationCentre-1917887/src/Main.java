
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        VehicleRegister vehicleRegister = new VehicleRegister();
        vehicleRegister.add(new RegistrationPlate("hello" , "hello"), "mate");
        vehicleRegister.printRegistrationPlates();
    }
}
