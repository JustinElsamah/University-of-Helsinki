import java.util.*;

public class Flight {
    
    private Airplane plane;
    private String departureCode;
    private String destinationCode;
    
    public Flight(Airplane plane, String departureCode, String destinationCode){
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String getPlaneID() {
        return this.plane.getId();
    }

    public int getPlaneCapacity() {
        return this.plane.getCapacity();
    }
    
    public String getDepartureCode() {
        return departureCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }
    
    
}
