
public class Change {
    
    private char originalLetter; 
    private char changedLetter;
    
    public Change(char fromCharacter, char toCharacter){
        originalLetter = fromCharacter;
        changedLetter = toCharacter;
        
    }
    
    public String change(String characterString){
        return characterString.replace(this.originalLetter, this.changedLetter);
    }
    
}
