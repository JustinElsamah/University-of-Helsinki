
import java.util.Scanner;

public class UserInterface {

    private final Jumpers jumpers;

    public UserInterface() {
        this.jumpers = new Jumpers();
    }

    public void start(Scanner reader) {
        System.out.println("Kumpula ski jumping week" + "\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        getJumpers(reader);
        System.out.println("\n" + "The tournament begins!" + "\n");
        startTournament(reader);
        exitScreen();
    }
    
    public void exitScreen(){
        jumpers.sortBackwards();
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        jumpers.endScreen();
    }

    public void startTournament(Scanner reader) {
        String userInput;
        int numRounds = 0;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            userInput = reader.nextLine();
            
            if (!userInput.equals("jump")) {
                break;
            }
            numRounds++; 
            System.out.println("\n" + "Round " + numRounds + "\n");
            System.out.println("Jumping order:");
            jumpers.sortJumpers();
            jumpers.listJumpers();
            System.out.println("\n" + "Results of round " + numRounds);
            jumpers.results();
            
            
        }

    }

    public void getJumpers(Scanner reader) {
        String jumpersName;
        while (true) {
            System.out.print("  Participant name: ");
            jumpersName = reader.nextLine();

            if (jumpersName.isEmpty()) {
                break;
            }

            jumpers.add(new Jumper(jumpersName));
        }
    }

}
