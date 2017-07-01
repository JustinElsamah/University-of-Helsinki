import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println(lastCharacter(name));
    }
    
    public static char lastCharacter(String text){
        int length = text.length();
        return text.charAt(length-1);
    }
}
