import java.util.*;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> vehicleRegister;
    
    public VehicleRegister(){
        vehicleRegister = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        
        if(vehicleRegister.containsKey(plate)){
            return false;
        }
        vehicleRegister.put(plate, owner);
            return true;
    }
    
    public String get(RegistrationPlate plate){
        return vehicleRegister.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(vehicleRegister.containsKey(plate)){
            vehicleRegister.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate key: vehicleRegister.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        
            Set<String> owners = new HashSet<String>(vehicleRegister.values());
            for(String owner:owners){
                System.out.println(owner);
            }
            
        
    }
    
}
