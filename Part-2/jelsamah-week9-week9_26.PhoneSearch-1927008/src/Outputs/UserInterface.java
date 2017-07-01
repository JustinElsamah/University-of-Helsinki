package Outputs;

import Functionality.CommandLogic;
import java.util.Scanner;

public class UserInterface {

    private CommandLogic logic = new CommandLogic();
    
    
    public void start(Scanner reader) {

        while (true) {
            System.out.print("\ncommand: ");
            String userInput = reader.nextLine();
            if (userInput.equals("1")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                logic.command1(name, number);

            } else if (userInput.equals("2")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                logic.command2(name);

            } else if (userInput.equals("3")) {
                System.out.print("number: ");
                String number = reader.nextLine();
                logic.command3(number);

            } else if (userInput.equals("4")) {
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                String address = street + " " + city;
                logic.command4(name, address);

            } else if (userInput.equals("5")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                logic.command5(name);

            } else if (userInput.equals("6")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                logic.command6(name);

            } else if (userInput.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String subString = reader.nextLine();
                logic.command7(subString);

            } else if (userInput.equals("x")) {
                break;
            }
        }
    }

}
