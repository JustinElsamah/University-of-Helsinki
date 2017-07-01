
import java.util.*;

public class TextUserInterface {
    
    private Scanner reader = new Scanner(System.in);
    private Dictionary dict = new Dictionary();
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:");
        System.out.println("quit - quit the text user interface" + "\n");
        String input;
        String finnish;
        String translation;
        while (true) {
            System.out.println("Statement: ");
            input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("In Finnish: ");
                finnish = reader.nextLine();
                System.out.println("Translation: ");
                translation = reader.nextLine();
                dict.add(finnish, translation);
            } if(input.equals("translate")){
                System.out.println("Give a word: ");
                input = reader.nextLine();
                System.out.print("Translation: ");
                System.out.println(dict.translate(input));
            }else {
                    
                System.out.println("Unknown statement");
            }
        }
        System.out.println("Cheers!");
    }
    
}
