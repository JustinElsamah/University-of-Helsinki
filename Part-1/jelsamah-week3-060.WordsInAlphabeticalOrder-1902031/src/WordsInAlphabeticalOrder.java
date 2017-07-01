
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String temp;
        while (true) {
            System.out.println("Type a word: ");
            temp = reader.nextLine();
            if (temp.isEmpty()) {
                Collections.sort(words);
                break;
            }
            words.add(temp);
        }
        for(String word: words){
            System.out.println(word);
        }
    }
}
