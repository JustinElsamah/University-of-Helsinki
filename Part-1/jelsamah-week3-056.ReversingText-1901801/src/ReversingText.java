
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int counter = 1;
        String reversedWord = "";
        while(text.length() >= counter){
            reversedWord += text.charAt(text.length()  - counter);
            counter++;
        }
        
        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
