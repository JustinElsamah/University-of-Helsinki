
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int lowBound = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upBound = Integer.parseInt(reader.nextLine());
        int i = lowBound;
        int sum = 0;
        while(i <= upBound){
            sum += i;
            System.out.println(sum);
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}

