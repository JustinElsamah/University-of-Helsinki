import ui.GraphicCalculator;
import javax.swing.SwingUtilities;
import logic.Calculator;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GraphicCalculator(new Calculator()));
    }
}
