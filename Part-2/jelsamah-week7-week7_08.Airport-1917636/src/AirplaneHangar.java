
import java.util.*;

public class AirplaneHangar {

    private ArrayList<Airplane> airplanes;

    public AirplaneHangar() {
        airplanes = new ArrayList<Airplane>();
    }

    public Airplane getPlaneWithId(String id) {

        for (Airplane plane : airplanes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public void printPlaneInfo(String id) {
        System.out.println(this.getPlaneWithId(id).getId()+" (" + this.getPlaneWithId(id).getCapacity() + " ppl)");
    }

    public void printPlanes() {
        for (Airplane plane : airplanes) {
            System.out.println(plane.getId() + " (" + plane.getCapacity() + " ppl)");
        }
    }

    public void add(Airplane airplane) {
        airplanes.add(airplane);
    }
}
