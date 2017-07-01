
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        int number;
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers: ");
        
        number = Integer.parseInt(reader.nextLine());
        while (number != -1) {
            stats.addNumber(number);
            if(number%2 == 0){
                evenStats.addNumber(number);
            }else{
                oddStats.addNumber(number);
            }
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + evenStats.sum());
        System.out.println("Sum of odd: " + oddStats.sum());
    }
}
