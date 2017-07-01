import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = 0;
        int sum = 0;
        int counter = 0;
        int evennums = 0;
        int oddnums = 0;
        while(true){
           num = Integer.parseInt(reader.nextLine());
           if(num == -1){
               break;
           }
           sum += num;
           counter++;
           if(num%2 == 0){
               evennums++;
           }else if(num%2 == 1){
               oddnums++;
           }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + ((double)sum / (double)counter));
        System.out.println("Even numbers: " + evennums);
        System.out.println("Odd numbers: " + oddnums);
    }
}
