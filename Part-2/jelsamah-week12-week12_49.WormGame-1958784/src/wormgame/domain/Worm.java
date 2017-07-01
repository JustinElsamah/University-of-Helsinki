package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

public class Worm {

    private final List<Piece> worm;
    private Direction direction;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        worm = new ArrayList<Piece>();
        worm.add(new Piece(originalX, originalY));
        this.direction = originalDirection;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.worm.size();
    }

    public List<Piece> getPieces() {
        return this.worm;
    }

    public void move() {
        if (this.getLength() < 3 || this.grow == true) {
            this.addPieceInDirection();
            this.grow = false;
        } else {
            worm.remove(0);
            this.addPieceInDirection();
        }
    }

    public static Piece getHead(List<Piece> worm) {
        return worm.get(worm.size() - 1);
    }

    public void grow() {
        this.grow = true;
    }

    public void addPieceInDirection() {
        if (null != this.direction) {
            switch (this.direction) {
                case DOWN:
                    worm.add(new Piece(getHead(this.worm).getX(), getHead(this.worm).getY() + 1));
                    break;
                case LEFT:
                    worm.add(new Piece(getHead(this.worm).getX() - 1, getHead(this.worm).getY()));
                    break;
                case RIGHT:
                    worm.add(new Piece(getHead(this.worm).getX() + 1, getHead(this.worm).getY()));
                    break;
                case UP:
                    worm.add(new Piece(getHead(this.worm).getX(), getHead(this.worm).getY() - 1));
                    break;
            }
        }
    }

    public boolean runsInto(Piece piece) {
        for (Piece myPiece : worm) {
            if (myPiece.getX() == piece.getX() && myPiece.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        int temp = 0;
        for (Piece piece1 : worm) {
            for (Piece piece2 : worm) {
                if (piece1.getX() == piece2.getX() && piece1.getY() == piece2.getY()) {
                    temp++;
                }
            }
            if(temp > 1){
                return true;
            }
            temp = 0;
        }
        return false;

    }
    

}
