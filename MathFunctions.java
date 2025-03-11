public class MathFunctions {
  public double add(double value1, double value2) {
    return value1 + value2;
  }

  public double substract(double value1, double value2) {
    return value1 - value2;
  }

  public double multiply(double value1, double value2) {
    return value1 * value2;
  }

  public double divide(double value1, double value2) {
    if (value2 == 0) {
      throw new IllegalArgumentException("No es posible realizar una division por cero");
    }

    return value1 / value2;
  }

  public double pow(double value1, double value2) {
    return Math.pow(value1, value2);
  }

  public double sqrt(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("No es posible calcular la raíz cuadrada de un número negativo");
    }
    return Math.sqrt(value);
  }

  public double log(double value) {
    if (value <= 0) {
      throw new IllegalArgumentException("No es posible calcular el logaritmo de un número no positivo");
    }
    return Math.log(value);
  }

  public double log10(double value) {
    if (value <= 0) {
      throw new IllegalArgumentException("No es posible calcular el logaritmo base 10 de un número no positivo");
    }
    return Math.log10(value);
  }

  public double sin(double value) {
    return Math.sin(value);
  }

  public double cos(double value) {
    return Math.cos(value);
  }

  public double tan(double value) {
    return Math.tan(value);
  }

  public double exp(double value) {
    return Math.exp(value);
  }

  public double abs(double value) {
    return Math.abs(value);
  }

  public double max(double value1, double value2) {
    return Math.max(value1, value2);
  }

  public double min(double value1, double value2) {
    return Math.min(value1, value2);
  }

  public double round(double value) {
    return Math.round(value);
  }

  public double floor(double value) {
    return Math.floor(value);
  }

  public double ceil(double value) {
    return Math.ceil(value);
  }

  public double signum(double value) {
    return Math.signum(value);
  }

  public double toRadians(double degrees) {
    return Math.toRadians(degrees);
  }
}
