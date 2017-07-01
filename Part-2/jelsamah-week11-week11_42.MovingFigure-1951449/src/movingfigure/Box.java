package movingfigure;

import java.awt.Graphics;

public class Box extends Figure {

    private int length;
    private int width;

    public Box(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(Graphics graphic) {
        graphic.fillRect(super.getX(), super.getY(), length, width);
    }

}
