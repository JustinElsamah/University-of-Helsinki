package movingfigure;

import movingfigure.Figure;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel{
    
    private Figure figure;
    
    public DrawingBoard(Figure figure){
        super.setBackground(Color.WHITE);
        this.figure = figure;
        
    }
    
    @Override
    protected void paintComponent(Graphics graphic){
        super.paintComponent(graphic);
        figure.draw(graphic);
    }
    
}
