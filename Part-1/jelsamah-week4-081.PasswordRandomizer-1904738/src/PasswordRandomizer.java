
import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;
    private String password ;
    private int counter;

    public PasswordRandomizer(int length) {
        random = new Random();
        this.length = length;
        this.password = "";
    }

    public String createPassword() {
        this.counter = 0;
        this.password = "";
        while (counter < this.length) {
            this.password = this.password.concat(Character.toString("abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26))));
            counter++;
        }
        
    return password;
    }
}
