package game;

import gameoflife.Board;
import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random rand = new Random();
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {
                if (d > rand.nextDouble() || d == 1) {
                    this.turnToLiving(x, y);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (!this.checkIfOutOfBounds(x, y)) {
            return super.getBoard()[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (!this.checkIfOutOfBounds(x, y)) {
            super.getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (!this.checkIfOutOfBounds(x, y)) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int livingNeighbours = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.isAlive(x + i - 1, y + j - 1)) {
                    livingNeighbours++;
                }
            }
        }
        if (this.isAlive(x, y)) {
            livingNeighbours--;
        }
        return livingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(livingNeighbours < 2){
            this.turnToDead(x, y);
        }else if(livingNeighbours == 3){
            this.turnToLiving(x, y);
        }else if(livingNeighbours > 3){
            this.turnToDead(x, y);
        }
    }

    public boolean checkIfOutOfBounds(int x, int y) {
        return x < 0 || x >= super.getWidth() || y < 0 || y >= super.getHeight();
    }

}
