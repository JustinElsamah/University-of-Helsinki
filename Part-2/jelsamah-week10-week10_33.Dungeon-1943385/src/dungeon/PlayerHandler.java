package dungeon;

public class PlayerHandler {

    private Character player;
    
    
    public PlayerHandler(){
        player = new Player(); 
    }
    
    public void printCoordinates(){
        System.out.println(player);
    }
    
    public boolean isPlayerHere(int xCoordinate, int yCoordinate){
        if(player.xCoordinate == xCoordinate && player.yCoordinate == yCoordinate){
            return true;
        }
        return false;
    }
    
    public void move(char[] moves, int xBounds, int yBounds){
        for(int i = 0; i < moves.length; i++){
            player.move(moves[i], xBounds, yBounds);
        }
    }
    
}
