import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    try {
      System.out.println("Digite seu nome:");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome:");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade:");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura:");
      double altura = scanner.nextDouble();

      System.out.println("     ");
      System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
      System.out.println("Tenho: " + idade + " anos");
      System.out.println("Minha altura é: " + altura + "m");
      scanner.close();
    } catch (InputMismatchException error) {
      System.out.println("Houve um erro: Idade e altura precisam ser números");
    }

  }
}
