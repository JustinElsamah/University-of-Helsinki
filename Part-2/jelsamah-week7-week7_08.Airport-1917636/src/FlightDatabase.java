
import java.util.*;

public class FlightDatabase {

    private ArrayList<Flight> flights;

    public FlightDatabase() {
        flights = new ArrayList<Flight>();
    }

    public void add(Flight flight) {
        flights.add(flight);
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight.getPlaneID() + " (" + flight.getPlaneCapacity() + " ppl) (" + flight.getDepartureCode() + "-" + flight.getDestinationCode() + ")");
        }

    }
}
