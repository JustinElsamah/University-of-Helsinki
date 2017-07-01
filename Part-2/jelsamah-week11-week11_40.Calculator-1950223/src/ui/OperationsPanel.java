package ui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class OperationsPanel extends JPanel{
    
    private JTextField untouchableText;
    private JTextField inputText;
    private Calculator calculator;
    
    public OperationsPanel(Calculator calculator, JTextField untouchableText, JTextField inputText){
        super(new GridLayout(1,3));
        this.calculator = calculator;
        this.untouchableText = untouchableText;
        this.inputText = inputText;
        this.createComponents();
    }
    
    public void createComponents(){
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton resetButton = new JButton("Z");
        
        resetButton.setEnabled(false);
        
        AddListener addListener = new AddListener(calculator, untouchableText, inputText, resetButton);
        MinusListener minusListener = new MinusListener(calculator, untouchableText, inputText,resetButton);
        ResetListener resetListener = new ResetListener(calculator, untouchableText, inputText,resetButton);
        
        plusButton.addActionListener(addListener);
        minusButton.addActionListener(minusListener);
        resetButton.addActionListener(resetListener);
        
        add(plusButton);
        add(minusButton);
        add(resetButton);
    }
    
}
