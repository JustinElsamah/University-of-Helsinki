package dungeon;

public class Player extends Character{

    int xBounds;
    int yBounds;
    
    public Player(){
        super.xCoordinate = 0;
        super.yCoordinate = 0;
    }


    @Override
    public void move(char move, int xBounds, int yBounds){
        super.move(move, xBounds, yBounds);
    }
    
    @Override
    public String toString(){
        return "@ " + super.toString();
    }

    
    
}

