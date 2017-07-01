import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Initializing an object in the class
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        //Effectively a getter method 
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
