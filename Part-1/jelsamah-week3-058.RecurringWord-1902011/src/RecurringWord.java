import java.util.*;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String temp = reader.nextLine();
            if(words.contains(temp)){
                System.out.println("you gave the word " + temp + " twice");
                break;
            }
            words.add(temp);
        }
        
    }
}
