package movingfigure;

import java.awt.Graphics;

public class Circle extends Figure{

    private int circumfrence;
    
    
    public Circle(int x, int y, int circumfrence){
        super(x, y);
        this.circumfrence = circumfrence;
    }
    
    @Override
    public void draw(Graphics graphic) {
        graphic.fillOval(super.getX(), super.getY(), circumfrence, circumfrence);
    }
    
}
