package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraLayout extends JFrame {

  private JTextField num1Field, num2Field, resultadoField;

  private Operations operations = new Operations();
  public OperationsEnum opEnum;

  public CalculadoraLayout() {
    setTitle("Calculadora");
    setSize(1080, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 5, 5);

    gbc.gridx = 0;
    gbc.gridy = 0;
    this.createLabel("Número 1: ", gbc);
    gbc.gridx = 1;
    num1Field = this.createTextField("Número 1", true,gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    this.createLabel("Número 2: ", gbc);
    gbc.gridx = 1;
    num2Field = this.createTextField("Número 2", true,gbc);
    add(num2Field, gbc);

    OperationsEnum[] operationsEnum = OperationsEnum.values();
    int gridY = 2;
    int gridX = 0;
    for (OperationsEnum op : operationsEnum) {
      gbc.gridx = gridX;
      gbc.gridy = gridY;
      gbc.gridwidth = 1;
      this.createButton(op.toString(), gbc);

      gridX++;
      if (gridX > 2) {
        gridX = 0;
        gridY++;
      }
    }

    gbc.gridx = 0;
    gbc.gridy = gridY + 1;
    gbc.gridwidth = 1;
    this.createLabel("Resultado", gbc);
    gbc.gridx = 1;
    resultadoField = this.createTextField("Resultados: ", false, gbc);
  }


  private void createButton(String textValue, GridBagConstraints gbc) {
    JButton button = new JButton(textValue);

    button.addActionListener(new ListenOperation());

    add(button, gbc);
  }

  
  private JTextField createTextField(String text, boolean editable, GridBagConstraints gbc) {
    JTextField textField = new JTextField();
    textField.setEditable(editable);

    add(textField, gbc);

    return textField;
  }


  private JLabel createLabel(String text, GridBagConstraints gbc) {
    JLabel label = new JLabel(text);

    add(label, gbc);

    return label;
  }

  
  private class ListenOperation implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());

        double resultado = operations.selectOperation(e, num1, num2);

        resultadoField.setText(String.valueOf(resultado));
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}