
import Outputs.Instructions;
import Outputs.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        UserInterface UI = new UserInterface();
        Instructions.print();
        UI.start(reader);
    }
}
