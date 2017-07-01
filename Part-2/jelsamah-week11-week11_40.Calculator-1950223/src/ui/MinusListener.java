package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.Calculator;

public class MinusListener implements ActionListener{
    
    private Calculator calculator;
    private JTextField untouchableText;
    private JTextField inputText;
    private JButton resetButton;
    
    public MinusListener(Calculator calculator, JTextField untouchableText, JTextField inputText, JButton resetButton){
        this.calculator = calculator;
        this.untouchableText = untouchableText;
        this.inputText = inputText;
        this.resetButton = resetButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        calculator.subtractFromCalculator(inputText.getText());
        this.untouchableText.setText(calculator.getValue());
        this.inputText.setText("");
        resetButton.setEnabled(true);
        if(Integer.parseInt(this.untouchableText.getText()) == 0){
            resetButton.setEnabled(false);
        }
        }catch(NumberFormatException exception){
            this.inputText.setText("");
        }
    }
    
}
