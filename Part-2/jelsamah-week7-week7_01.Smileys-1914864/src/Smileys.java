
public class Smileys {

    public static void main(String[] args) {
       
        printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        int lengthOfWord;
        if(characterString.length() % 2 == 1){
            lengthOfWord = characterString.length()+1;
        }else{
            lengthOfWord = characterString.length();
        }
        int numOfSmilies = (lengthOfWord+6)/2;
        printLine(numOfSmilies);
        if(characterString.length() % 2 == 1){
        System.out.println(":) " + characterString + "  :)");
        }else{
            System.out.println(":) " + characterString + " :)");
        }
        
        printLine(numOfSmilies);
        
    }
    
    public static void printLine(int numOfSmilies){
        for(int i = 0; i < numOfSmilies; i++){
            System.out.print(":)");
        }
        System.out.print("\n");
    }

}
