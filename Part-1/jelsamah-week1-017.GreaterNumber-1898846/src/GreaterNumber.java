import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        boolean num1grtnum2 = num1 > num2;
        boolean num2grtnum1 = num1 < num2;
        if(num1grtnum2){
            System.out.println("Greater number: " + num1);
        }else if(num2grtnum1){
            System.out.println("Greater number: " + num2);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
