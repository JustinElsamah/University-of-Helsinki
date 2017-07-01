
import java.util.*;

public class Database {

    private String observed;
    private ArrayList<Birds> birds = new ArrayList<Birds>();

    public void add(Scanner reader) {
        System.out.println("Name: ");
        String name = reader.nextLine();
        System.out.println("Latin Name: ");
        String latinName = reader.nextLine();
        Birds bird = new Birds(name, latinName);
        this.birds.add(bird);
    }

    public void observation(Scanner reader) {
        System.out.println("What was observed:? ");
        boolean found = false;
        this.observed = reader.nextLine();
        for (Birds bird : this.birds) {
            if (bird.getName().equals(observed)) {
                bird.increaseNumOfOccurences();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Is not a bird!");
        }

    }

    public void statistics() {
        for (Birds bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void show(Scanner reader) {
        System.out.println("What? ");
        String what = reader.nextLine();
    for (Birds bird : this.birds) {
            if (bird.getName().equals(what)) {
                System.out.println(bird);
            }
        }
    }

}
