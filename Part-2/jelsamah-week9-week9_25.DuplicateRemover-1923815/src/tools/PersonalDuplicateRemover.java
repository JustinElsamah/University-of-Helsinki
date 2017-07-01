package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    
        private Set<String> words;
        private int numberOfDetectedDuplicates;
        
    public PersonalDuplicateRemover(){
        words = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        int initialSize = words.size();
        words.add(characterString);
        if(initialSize == words.size()){
            numberOfDetectedDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numberOfDetectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return words;
    }

    @Override
    public void empty() {
        words.clear();
        numberOfDetectedDuplicates = 0;
    }

}
