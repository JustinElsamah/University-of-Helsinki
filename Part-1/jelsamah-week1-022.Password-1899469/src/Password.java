
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        // Write your code here
        while(true){
                System.out.println("Type the password: ");
                String Guess = reader.nextLine();
                if(Guess.equals(password)){
                    break;
                }
                System.out.println("Wrong!");
        }
        System.out.println("Right!\n");
        System.out.println("The secret is: moon man!");
    }
}
