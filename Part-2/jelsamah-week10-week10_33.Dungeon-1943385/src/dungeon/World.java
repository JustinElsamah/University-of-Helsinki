package dungeon;

public class World {

    private int removablexCoordinate;
    private int removableyCoordinate;

    public void print(int xBound, int yBound, PlayerHandler playerHandler, VampireHandler vampireHandler) {
        int[][] index = new int[xBound][yBound];

        int i = 0;
        int y = 0;
        while (i < xBound) {
            y = 0;
            while (y < yBound) {
                
                if (playerHandler.isPlayerHere(y, i)) {
                    System.out.print("@");
                } else if (vampireHandler.isVampireHere(y, i)) {
                    System.out.print("v");
                } else {
                    System.out.print(".");
                }
                y++;
            }
            System.out.println();
            i++;
        }
    }

}
