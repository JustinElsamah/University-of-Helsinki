package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class ResetListener implements ActionListener{
    
    private Calculator calculator;
    private JTextField untouchableText;
    private JTextField inputText;
    private JButton resetButton;
    
    public ResetListener(Calculator calculator, JTextField untouchableText, JTextField inputText, JButton resetButton){
        this.calculator = calculator;
        this.untouchableText = untouchableText;
        this.inputText = inputText;
        this.resetButton = resetButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.resetCalculator();
        this.untouchableText.setText("0");
        this.inputText.setText("");
        resetButton.setEnabled(false);
    }
    
}
