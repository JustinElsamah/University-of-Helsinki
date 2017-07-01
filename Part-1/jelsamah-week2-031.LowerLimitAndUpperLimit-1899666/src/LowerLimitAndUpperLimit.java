
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int lowLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upLimit = Integer.parseInt(reader.nextLine());
        int x = lowLimit;
        while(upLimit >= x){
            System.out.println(x);
            x++;
        }
    }
}
