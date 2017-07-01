package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public final class WormGame extends Timer implements ActionListener {

    private final int width;
    private final int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private final Random rand;

    public WormGame(int width, int height) {
        super(1000, null);
        this.width = width;
        this.height = height;
        this.continues = true;
        rand = new Random();
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        apple = makeApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    public Apple makeApple() {
        Apple temp;
        do {
            temp = new Apple(rand.nextInt(width), rand.nextInt(height));
        } while ((temp.getX() == width / 2 && temp.getY() == height / 2));
        return temp;
    }

    public Worm getWorm() {
        return this.worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            apple = makeApple();
            worm.grow();
        }
        if (worm.runsIntoItself()) {
            continues = false;
        }
        for(Piece piece:worm.getPieces()){
            if(piece.getX() < 0 || piece.getX() > width-1 || piece.getY() < 0 || piece.getY() > height-1){
                continues = false;
            }
        }

        updatable.update();

        super.setDelay(1000 / worm.getLength());

        if (!continues) {
            return;
        }

    }

}
