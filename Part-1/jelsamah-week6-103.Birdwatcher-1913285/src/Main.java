
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database database = new Database();


        String selection = "";
        
        while (!(selection.equals("Quit"))) {
            System.out.println("?");

            selection = reader.nextLine();
            if (selection.contains("Add")) {
                database.add(reader);
            } else if (selection.contains("Observation")) {
                database.observation(reader);
            } else if (selection.contains("Statistics")) {
                database.statistics();
            } else if (selection.contains("Show")) {
                database.show(reader);
            }
        }
    }
}

