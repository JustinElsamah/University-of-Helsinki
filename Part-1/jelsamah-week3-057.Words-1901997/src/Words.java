import java.util.*;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
       
        while(true){
            System.out.println("Type a word: ");
            String temp = reader.nextLine(); 
            if(temp.isEmpty()){
                break;
            }
            words.add(temp);
        }
        System.out.println("You typed the following words: ");
        for(String word : words){
            System.out.println(word);
        }
    }
}
