
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        boolean rightGuess = false;
        int guessesMade = 0;
        // program your solution here. Do not touch the above lines!
       
        while(!rightGuess){
            System.out.println("Guess number: ");
            guessesMade++;
        int Guess = Integer.parseInt(reader.nextLine());
        if(Guess < numberDrawn){
            System.out.println("The number is greater, guesses made: " + guessesMade);
        }else if(Guess > numberDrawn){
            System.out.println("The number is lesser, guesses made: " + guessesMade);
        }else{
            System.out.println("Congratulations, your guess is correct!");
            rightGuess = true;
        }
    }
      
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
