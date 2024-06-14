import java.util.Scanner;

public class Conta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          double valorDeposito = scanner.nextDouble();
          saldo = deposito(saldo, valorDeposito);
          break;
        case 2:
          /**
           * TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
           **/
          double valorSaque = scanner.nextDouble();
          saldo = saque(saldo, valorSaque);
          break;
        case 3:
          // TODO: Exibir o saldo atual da conta.
          saldoAtual(saldo);
          break;
        case 0:
          System.out.println("Programa encerrado.");
          continuar = false; // Atualiza a variável de controle para encerrar o loop
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    scanner.close();
  }

  /**
   * Function that makes a deposit to the account
   **/
  public static double deposito(Double saldo, Double valorDeposito) {
    double novoSaldo = saldo += valorDeposito;
    System.out.printf("Saldo atual: %.1f " + novoSaldo);
    return novoSaldo;
  }

  /**
   * Function that makes a whitdraw from the account
   **/
  public static double saque(Double saldo, Double valorSaque) {
    if (valorSaque > saldo) {
      System.out.println("Saldo insuficiente.");
      return saldo;
    } else {
      double novoSaldo = saldo -= valorSaque;
      System.out.printf("Saldo atual: %.1f ", saldo);
      return novoSaldo;
    }
  }

  /**
   * Function that shows the money account
   **/

  public static void saldoAtual(Double saldo) {
    System.out.printf("Saldo atual: %.1f ", saldo);
  }
}