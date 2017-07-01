
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = 1;
        System.out.print("In reverse order: ");
        while (name.length() >= counter) {
            System.out.print(name.charAt(name.length() - counter));
            counter++;
        }
    }
}
