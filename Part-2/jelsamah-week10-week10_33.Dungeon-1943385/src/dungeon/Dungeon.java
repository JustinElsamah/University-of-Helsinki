package dungeon;

import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private VampireHandler vampireHandler;
    private PlayerHandler playerHandler;
    private Scanner reader = new Scanner(System.in);
    private World world = new World();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        playerHandler = new PlayerHandler();
        vampireHandler = new VampireHandler(this.vampires, length, height);
    }

    public void run() {
        while (this.moves > 0) {
           
                System.out.println(moves + "\n");
                this.moves--;
                playerHandler.printCoordinates();
                vampireHandler.printCoordinates();
                System.out.println();
                world.print(length, height, playerHandler, vampireHandler);
                System.out.println();
                String move = reader.nextLine();
                char[] moves = move.toCharArray();
                playerHandler.move(moves, length, height);
                vampireHandler.removeVampireIfOnPlayerSquare(playerHandler);
                if(vampiresMove){
                    vampireHandler.move(moves.length, playerHandler);
                }
                if (vampireHandler.noMoreVapires() == true) {
                    System.out.println("YOU WIN");
                    break;
                }
        }
        if (this.moves == 0) {
            System.out.println("YOU LOSE");
        }
    }
}
