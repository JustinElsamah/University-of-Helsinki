package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class VampireHandler {

    private List<Character> vampires;
    private List<Character> vampiresRemovable;
    private int xBounds;
    private int yBounds;
    private Random rand;
    private int xCoordinate;
    private int yCoordinate;

    public VampireHandler(int numOfVampires, int xBounds, int yBounds) {
        rand = new Random();
        this.xBounds = xBounds;
        this.yBounds = yBounds;
        this.vampires = new ArrayList<Character>();
        this.vampiresRemovable = new ArrayList<Character>();
        this.addVampires(numOfVampires);
    }

    public boolean isVampireHere(int xCoordinate, int yCoordinate) {
        for (Character vampire : vampires) {
            if (vampire.xCoordinate == xCoordinate && vampire.yCoordinate == yCoordinate) {
                return true;
            }
        }
        return false;
    }

    public void removeVampire(int xCoordinate, int yCoordinate) {
        for (Character vampire : vampires) {
            if (vampire.xCoordinate == xCoordinate && vampire.yCoordinate == yCoordinate) {
                vampires.remove(vampire);
            }
        }
    }

    public void removeVampireIfOnPlayerSquare(PlayerHandler playerHandler) {
        for (Character vampire : vampires) {
            if (playerHandler.isPlayerHere(vampire.xCoordinate, vampire.yCoordinate)) {
                vampiresRemovable.add(vampire);
            }
        }
        vampires.removeAll(vampiresRemovable);
    }

    public boolean noMoreVapires(){
        if(vampires.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void addVampires(int numOfVampires) {
        boolean reset = true;
        for (int i = 0; i < numOfVampires; i++) {
            reset = true;
            while (reset) {
                reset = false;
                xCoordinate = rand.nextInt(xBounds);
                yCoordinate = rand.nextInt(yBounds);
                for (Character vampire : vampires) {
                    if (xCoordinate == vampire.xCoordinate && yCoordinate == vampire.yCoordinate || xCoordinate == 0 && yCoordinate == 0) {
                        reset = true;
                    }
                }
            }
            vampires.add(new Vampire(xCoordinate, yCoordinate));
        }

    }

    public void printCoordinates() {
        for (Character character : vampires) {
            System.out.println(character);
        }
    }

    public void move(int howManyMoves, PlayerHandler playerHandler) {
        for(Character vampire : vampires){
            for(int i = 0; i < howManyMoves; i++){
                switch(rand.nextInt(4)) {
                    case 0: vampire.move('a', xBounds, yBounds);
                    break;
                    case 1: vampire.move('s', xBounds, yBounds);
                    break;
                    case 2: vampire.move('d', xBounds, yBounds);
                    break;
                    default: vampire.move('w', xBounds, yBounds);
                    break;
                }
                if(this.vampireOnTopOfAnother(vampire, playerHandler)){
                    vampire.xCoordinate = vampire.getTempxCoordinate();
                    vampire.yCoordinate = vampire.getTempyCoordinate();
                }
            }
        }
    }
    
    public boolean vampireOnTopOfAnother(Character vampire,  PlayerHandler playerHandler){
        int counter = 0;
        for(Character otherVampire: vampires){
            if(vampire.xCoordinate == otherVampire.xCoordinate && vampire.yCoordinate == otherVampire.yCoordinate){
                counter++;
            }
        }
        if(playerHandler.isPlayerHere(vampire.xCoordinate, vampire.yCoordinate )){
            counter++;
        }
        
        if(counter > 1){
            return true;
        }
        return false;
    }
    

}
