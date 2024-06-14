public class Operadores2 {
  public static void main(String[] args) {
    // _______________________________________
    // Operadores lógicos && (E) e Operadores || (ou)
    boolean condicao1 = true;
    boolean condicao2 = true;

    String condicaoResult = condicao1 && condicao2 ? "As duas condições são verdadeiras"
        : "Uma das condições é falsa";
    String condicaoResult2 = condicao1 || condicao2 ? "UMA ou DUAS das condições são verdadeiras"
        : "As duas condições são falsas";

    System.out.println(condicaoResult);
    System.out.println(condicaoResult2);

    // // _______________________________________
    // int a, b;
    // a = 3;
    // b = 5;

    // boolean resultado = a == b ? true : false;

    // System.out.println(resultado);
    // // _______________________________________
    // boolean verdadeiro = true;
    // System.out.println("Expressão é -> " + verdadeiro);

    // verdadeiro = !verdadeiro; // Negando a expressão

    // System.out.println("Expressão é -> " + verdadeiro);
    // // _______________________________________
    // int numero = 1;
    // System.out.println(numero);

    // numero++;

    // System.out.println(numero);
    // // _______________________________________
    // int numeroDois = 2;
    // numeroDois = -numeroDois; // Transforma o número positivo em negativo

    // System.out.println("Negativo: " + numeroDois);

    // numeroDois = numeroDois * -1; // Transforma um número negativo em positivo

    // System.out.println("Positivo: " + numeroDois);
    // // _______________________________________
  }
}
