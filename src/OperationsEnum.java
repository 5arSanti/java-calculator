package src;
public enum OperationsEnum {
  SUMA("Suma"),
  RESTA("Resta"),
  MULTIPLICACION("Multiplicación"),
  DIVISION("División"),
  POTENCIA("Potencia"),
  RAIZ("Raíz cuadrada"),
  LOGARITMO("Logaritmo natural"),
  LOGARITMO_BASE_10("Logaritmo base 10"),
  SENO("Seno"),
  COSENO("Coseno"),
  TANGENTE("Tangente"),
  EXPONENCIAL("Exponencial"),
  ABSOLUTO("Valor absoluto"),
  MAXIMO("Máximo"),
  MINIMO("Mínimo"),
  REDONDEO("Redondeo"),
  REDONDEO_ABAJO("Redondeo hacia abajo"),
  REDONDEO_ARRIBA("Redondeo hacia arriba"),
  SIGNO("Signo del valor ingresado"),
  RADIANES("Convertir a radianes");

  private final String text;

  OperationsEnum(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}