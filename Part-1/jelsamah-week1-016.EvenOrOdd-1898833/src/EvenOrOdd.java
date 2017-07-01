
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        String string1;
        if((num1 % 2) == 1 || (num1 % 2) == -1){
            string1 = "odd";
        }else{
            string1 = "even";
        }
        System.out.println("Number " + num1 + " is " + string1 + ".");
    }
}
