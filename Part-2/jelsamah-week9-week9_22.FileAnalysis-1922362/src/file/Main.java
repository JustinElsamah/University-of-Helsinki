package file;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("src/testfile.txt");
        Analysis analysis = new Analysis(file);
    }
}
