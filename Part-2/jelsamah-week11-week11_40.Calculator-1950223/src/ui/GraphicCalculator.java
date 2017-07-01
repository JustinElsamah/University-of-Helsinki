package ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import logic.Calculator;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public GraphicCalculator(Calculator calculator){
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        JTextField untouchableText = new JTextField("0");
        untouchableText.setEnabled(false);
        JTextField inputText = new JTextField();
        OperationsPanel panel = new OperationsPanel(calculator, untouchableText, inputText);
        container.add(untouchableText);
        container.add(inputText);
        container.add(panel);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}