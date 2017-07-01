package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private List<Figure> figures;

    public CompoundFigure() {
        super(0, 0);
        figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void draw(Graphics graphic) {
        for (Figure figure : figures) {
            figure.draw(graphic);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
    }

}
