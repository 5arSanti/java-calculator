import java.awt.event.ActionEvent;

public class Operations {
  public double selectOperation(ActionEvent e, double num1, double num2) {
    MathFunctions operations = new MathFunctions();

    String action = e.getActionCommand();

    double resultado = 0;

    if (action == OperationsEnum.SUMA.toString()) {
      resultado = operations.add(num1, num2);
    }
    if (action == OperationsEnum.RESTA.toString()) {
      resultado = operations.substract(num1, num2);
    }
    if (action == OperationsEnum.MULTIPLICACION.toString()) {
      resultado = operations.multiply(num1, num2);
    }
    if (action == OperationsEnum.DIVISION.toString()) {
      resultado = operations.divide(num1, num2);
    }
    if (action == OperationsEnum.POTENCIA.toString()) {
      resultado = operations.pow(num1, num2);
    }
    if (action == OperationsEnum.RAIZ.toString()) {
      resultado = operations.sqrt(num1);
    }
    if (action == OperationsEnum.LOGARITMO.toString()) {
      resultado = operations.log(num1);
    }
    if (action == OperationsEnum.LOGARITMO_BASE_10.toString()) {
      resultado = operations.log10(num1);
    }
    if (action == OperationsEnum.SENO.toString()) {
      resultado = operations.sin(num1);
    }
    if (action == OperationsEnum.COSENO.toString()) {
      resultado = operations.cos(num1);
    }
    if (action == OperationsEnum.TANGENTE.toString()) {
      resultado = operations.tan(num1);
    }
    if (action == OperationsEnum.EXPONENCIAL.toString()) {
      resultado = operations.exp(num1);
    }
    if (action == OperationsEnum.ABSOLUTO.toString()) {
      resultado = operations.abs(num1);
    }
    if (action == OperationsEnum.MAXIMO.toString()) {
      resultado = operations.max(num1, num2);
    }
    if (action == OperationsEnum.MINIMO.toString()) {
      resultado = operations.min(num1, num2);
    }
    if (action == OperationsEnum.REDONDEO.toString()) {
      resultado = operations.round(num1);
    }
    if (action == OperationsEnum.REDONDEO_ABAJO.toString()) {
      resultado = operations.floor(num1);
    }
    if (action == OperationsEnum.REDONDEO_ARRIBA.toString()) {
      resultado = operations.ceil(num1);
    }
    if (action == OperationsEnum.SIGNO.toString()) {
      resultado = operations.signum(num1);
    }
    if (action == OperationsEnum.RADIANES.toString()) {
      resultado = operations.toRadians(num1);
    }

    return resultado;
  }
}