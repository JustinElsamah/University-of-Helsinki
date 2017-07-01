
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private List<String> lines;
    private Scanner reader;
    private File file;
    private FileWriter writer;

    public FileManager() {
        lines = new ArrayList<String>();
    }

    public List<String> read(String file) throws FileNotFoundException {
        this.file = new File(file);
        reader = new Scanner(this.file);

        while (reader.hasNext()) {
            lines.add(reader.nextLine());
        }

        return lines;
    }

    public void save(String file, String text) throws IOException {
        writer = new FileWriter(file);
        writer.write(text);
        writer.close();

    }

    public void save(String file, List<String> texts) throws IOException {
        writer = new FileWriter(file);
        for (String line : texts) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}
