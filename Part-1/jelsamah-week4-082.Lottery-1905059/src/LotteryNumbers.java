
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private Random random = new Random();
    private ArrayList<Integer> numbers;
    private int lotteryDraw;
    private int counter;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        counter = 0;
        while (counter < 7) {
            lotteryDraw = random.nextInt(39) + 1;
            if (containsNumber(lotteryDraw)) {
                counter--;
            } else {
                this.numbers.add(lotteryDraw);
            }
            counter++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
