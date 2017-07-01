package dungeon;

import java.util.Random;

public class Vampire extends Character {
    
    
    public Vampire(int xCoordinate, int yCoordinate) {
        super.xCoordinate = xCoordinate;
        super.yCoordinate = yCoordinate;
    }
    
    @Override
    public void move(char move, int xBounds, int yBounds) {
        this.tempxCoordinate = this.xCoordinate;
        this.tempyCoordinate = this.yCoordinate;
        super.move(move, xBounds, yBounds);
    }
    
    @Override
    public String toString() {
        return "v " + super.toString();
    }

}
