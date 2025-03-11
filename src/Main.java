package src;
import javax.swing.SwingUtilities;

public class Main {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      CalculadoraLayout calculadora = new CalculadoraLayout();
      calculadora.setVisible(true);
    });
  }
}
