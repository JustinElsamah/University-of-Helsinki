package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
    
    BorderLayout layout = new BorderLayout();
    container.setLayout(layout);
    
    JLabel label = new JLabel("0");
    JButton button = new JButton("Click!");
    container.add(label, BorderLayout.WEST);
    container.add(button, BorderLayout.SOUTH);
    
    ClickListener listener = new ClickListener(calculator, label);
    button.addActionListener(listener);
    
   
    
    }

    public JFrame getFrame() {
        return frame;
    }
}
