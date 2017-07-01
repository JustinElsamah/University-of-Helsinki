
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name1 = reader.nextLine();
        System.out.println("Type your age: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String name2 = reader.nextLine();
        System.out.println("Type your age: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println(name1 + " and " + name2 + " are " + (num1 + num2) + " years old in total.");
        // Implement your program here
    }
}
