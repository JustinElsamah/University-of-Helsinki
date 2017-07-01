
import java.io.File;
import java.util.Scanner;

public class Printer {

    private String fileName;
    private Scanner reader;
    private File file;

    public Printer(String fileName) {
        this.fileName = fileName;
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        reader = new Scanner(file, "UTF-8");
        String currentLine;
        while (reader.hasNextLine()) {
            currentLine = reader.nextLine();
            if (currentLine.contains(word) || word.isEmpty()) {
                System.out.println(currentLine);
            }
        }
    }

}
