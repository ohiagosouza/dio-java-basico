import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    int firstNumber = scanner.nextInt();

    System.out.println("Digite o primeiro número:");
    int secondNumber = scanner.nextInt();

    try {
      contar(firstNumber, secondNumber);

    } catch (Exception e) {
      System.out.println("O segundo parâmetro deverá ser maior que o primeiro");
    }

    scanner.close();
  }

  public static void contar(int first, int second) throws ParametroInvalidoException {
    for (int i = first; i <= second; i++) {
      if (first < second) {
        System.out.printf("Imprimindo o número: " + i + "\n");
      } else {
        throw new InputMismatchException();
      }
    }
  }

  public class ParametroInvalidoException extends Exception {
    public static String returException() {
      throw new InputMismatchException();
    }
  }
}
