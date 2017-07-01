package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable{
    
    private JFrame frame;
    
    @Override
    public void run(){
            
        frame = new JFrame("Notice Board");
        
        frame.setPreferredSize(new Dimension(400, 1200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void createComponents(Container container){
        
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        JTextField text = new JTextField("Hello World");
        JButton button = new JButton("Copy!");
        JLabel label = new JLabel();
       
        ActionEventListener listener = new ActionEventListener(text, label);
        button.addActionListener(listener);
        container.add(text);
        container.add(button);
        container.add(label);
        
        
    }
}