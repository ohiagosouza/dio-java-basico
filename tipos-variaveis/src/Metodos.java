public class Metodos {
  public static void main(String[] args) {
    double firstSum = Metodos.sum(2.253, 2.133); // chamando o método no método padrão.
    System.out.println(firstSum);
  }

  public static double sum(double num1, double num2) { // Definindo um método fora da chamada padrão
    return num1 + num2;
  }
}
