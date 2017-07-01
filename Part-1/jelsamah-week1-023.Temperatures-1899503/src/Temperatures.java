
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.println("What is the floating point number: ");
            double data = Double.parseDouble(reader.nextLine());
            if(data>=-30&&data<=40){
            Graph.addNumber(data);
            }
        }
    }
}