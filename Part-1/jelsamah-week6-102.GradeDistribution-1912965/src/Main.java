
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Integer> numbers = UserInput.inputNumbersIntoArrayList(reader);
        
        PrintStars.printArrayAsStars(Logic.convertArrayListToArray(numbers));
        
        Logic.percentageCalculation(numbers);
    }

}
 