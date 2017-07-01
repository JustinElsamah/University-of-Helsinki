package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {

    private File file;
    private List<String> lines = new ArrayList<String>();
    
    public Analysis(File file) throws Exception {
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
    }

    public int lines(){
       int i = 0;
       for(String line : lines){
           i++;
       }
       return i;
    }

    public int characters(){
       int i = 0;
       for(String line : lines){
           i += line.length()+1;
       }
       return i;
    }
}
