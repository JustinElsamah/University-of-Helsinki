package movingfigure;

import movingfigure.Figure;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import movingfigure.KeyboardListener;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;
    
    public UserInterface(Figure figure){
        this.figure = figure;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard board = new DrawingBoard(this.figure);
        KeyboardListener listener = new KeyboardListener(board, this.figure);
        container.add(board);
        frame.addKeyListener(listener);
        
    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
