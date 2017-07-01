
public class Main {

    public static void main(String[] args) throws Exception {
       Printer t = new Printer("src/textfile.txt");
       t.printLinesWhichContain("word");
       t.printLinesWhichContain("koe");
    }
}
