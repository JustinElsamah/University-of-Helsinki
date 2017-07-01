package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> dictionary;
    private FileWriter writer;
    private File file;
    private String fileName;
    private Scanner reader;
    private String removable;

    public MindfulDictionary() throws IOException{
         dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws IOException{
        dictionary = new HashMap<String, String>();
        fileName = file;
        this.file = new File(this.fileName);
    }

    public boolean load() {
        try{
        this.reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");   
            dictionary.put(parts[0], parts[1]);
        }
        return true;
        }catch(FileNotFoundException e){
            return false;
        }
        
    }
    
    public boolean save(){
        try{
        writer = new FileWriter(fileName);
        for(String word:dictionary.keySet()){
            writer.write(word + ":" + dictionary.get(word) + "\n");
        }
        writer.close();
        return true;
        }catch(IOException e){
            return false;
        }
        
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (dictionary.containsValue(word)) {
            for (String temp : dictionary.keySet()) {
                if (dictionary.get(temp).equals(word)) {
                    return temp;
                }
            }
        }
        return null;
    }

    public void remove(String word) {
        
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }else if (dictionary.containsValue(word)) {
            for (String temp : dictionary.keySet()) {
                if (dictionary.get(temp).equals(word)) {
                    this.removable = temp;
                }
            }
        }
        dictionary.remove(this.removable);
    }

}
