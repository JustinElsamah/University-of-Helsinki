
package dungeon;

public abstract class Character {

    protected int xCoordinate;
    protected int yCoordinate;
    protected int tempxCoordinate;
    protected int tempyCoordinate;
    
    public void move(char move, int xBounds, int yBounds){
        switch (move) {
            case 'w':
                yCoordinate--;
                break;
            case 'a':
                xCoordinate--;
                break;
            case 's':
                yCoordinate++;
                break;
            case 'd':
                xCoordinate++;
                break;
            default:
                break;
        }
        if(xCoordinate < 0){
            xCoordinate = 0;
        }
        if(xCoordinate > xBounds-1){
            xCoordinate = xBounds-1;
        }
        if(yCoordinate < 0){
            yCoordinate = 0;
        }
        if(yCoordinate > yBounds-1){
            yCoordinate = yBounds-1;
        }
    }
    
    public int getTempxCoordinate() {
        return tempxCoordinate;
    }

    public int getTempyCoordinate() {
        return tempyCoordinate;
    }
    
    @Override
    public String toString(){
        return xCoordinate + " " + yCoordinate;
    }

}


