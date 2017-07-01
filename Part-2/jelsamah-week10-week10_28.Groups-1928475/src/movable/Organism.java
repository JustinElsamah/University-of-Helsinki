package movable;

public class Organism implements Movable{

    private int xCoordinate;
    private int yCoordinate;
    
    public Organism(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
    @Override
    public String toString(){
        return ("x: " + xCoordinate + "; y: " + yCoordinate);
    }
    
    @Override
    public void move(int dx, int dy) {
        xCoordinate += dx;
        yCoordinate += dy;
    }

}
