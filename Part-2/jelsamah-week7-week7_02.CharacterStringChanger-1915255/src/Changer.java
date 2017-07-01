import java.util.*;

public class Changer {
    
    private ArrayList<Change> changing;
    
    public Changer(){
        changing = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changing.add(change);
    }
    
    public String change(String characterString){
        for(Change chan: changing){
             characterString = chan.change(characterString);
        }
        return characterString;
    }
    
}

