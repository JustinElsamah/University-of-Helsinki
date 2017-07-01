
import java.util.*;

public class UserInterface {

    private AirplaneHangar airplanes = new AirplaneHangar();
    private FlightDatabase flights = new FlightDatabase();
    private String input;
    private String planeID;
    private String departureCode;
    private String destinationCode;
    private int planeCapacity;

    public void Start(Scanner reader) {

        this.airportPanel(reader);
        this.flightServices(reader);

    }

    public void flightServices(Scanner reader) {
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            input = reader.nextLine();
            if(input.equals("1")){
                airplanes.printPlanes();
            }else if(input.equals("2")){
                flights.printFlights();
            }else if(input.equals("3")){
                System.out.print("Give plane ID: ");
                airplanes.printPlaneInfo(reader.nextLine());
            }else if(input.equals("x")){
                break;
            }
        }
    }

    public void airportPanel(Scanner reader) {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            input = reader.nextLine();

            if (input.equals("1")) {

                inputAirplane(reader);

            } else if (input.equals("2")) {
                inputFlight(reader);

            } else if (input.equals("x")) {
                break;
            }
        }
    }

    public void inputFlight(Scanner reader) {
        System.out.print("Give plane ID: ");
        planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        destinationCode = reader.nextLine();
        Airplane plane = airplanes.getPlaneWithId(planeID);
        Flight flight = new Flight(plane, departureCode, destinationCode);
        flights.add(flight);
    }

    public void inputAirplane(Scanner reader) {
        System.out.print("Give plane ID: ");
        planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        planeCapacity = Integer.parseInt(reader.nextLine());
        Airplane airplane = new Airplane(planeID, planeCapacity);
        airplanes.add(airplane);
    }

}
