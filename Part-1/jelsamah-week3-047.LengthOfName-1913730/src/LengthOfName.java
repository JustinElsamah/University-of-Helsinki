
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println(calculateCharacters(name));
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        return text.length();
    }
    
    
}
