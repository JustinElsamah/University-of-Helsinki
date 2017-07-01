
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int upLimit = Integer.parseInt(reader.nextLine());
        int x = 1;
        while(upLimit >= x){
            System.out.println(x);
            x++;
        }
        // Write your code here
        
    }
}
