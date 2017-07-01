
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        boolean num1grtnum2;
        num1grtnum2 = num1 > num2;
        
        if(num1grtnum2){
        System.out.println("The bigger number of the two numbers given was: " + num1);
        }else{
        System.out.println("The bigger number of the two numbers given was: " + num2);
        }

    }
}

